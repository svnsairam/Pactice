/**
 * Given a string containing only digits, restore it by returning all possible valid IP address combinations.

A valid IP address must be in the form of A.B.C.D, where A,B,C and D are numbers from 0-255. The numbers cannot be 0 prefixed unless they are 0.

Example:

Given “25525511135”,

return [“255.255.11.135”, “255.255.111.35”]. (Make sure the returned strings are sorted in order)
 */

import java.util.ArrayList;

class IB_Valid_Ip_Addresses{
    public static void main(String[] args) {
        
    }
    public ArrayList<String> restoreIpAddresses(String A) {
        ArrayList<IPAddr> resultIpAddr = new ArrayList<>();
        ArrayList<String> resultIPString = new ArrayList<>();
        
        if(A.length()>12){
            return resultIPString;
        }
        
        for(int i=1;i<=A.length()-3 && i-0<=3;i++){
            String a = A.substring(0, i);
            if(validateIPString(a)){
                for(int j=i+1;j<=A.length()-2 && j-i<=3;j++){
                    String b = A.substring(i, j);
                    if(validateIPString(b)){
                        for(int k=j+1;k<=A.length()-1 && k-j<=3;k++){
                            if(A.length()-k<=3){
                             String c = A.substring(j, k);
                            String d = A.substring(k, A.length());
                            if(validateIPString(c)&&validateIPString(d)){
                                resultIpAddr.add(new IPAddr(a, b, c, d));
                            }   
                            }
                            
                        }
                    }
                }
            }
        }
        for(int i=0;i<resultIpAddr.size();i++){
            resultIPString.add(resultIpAddr.get(i).toString());
        }
        return resultIPString;
    }

    public boolean validateIPString(String str){
        if(str.length()==0){
            return false;
        }
        if(str.length()==1){
            return true;
        }
        else{
            if(str.charAt(0)=='0'){
                return false;
            }
        }
        int num = Integer.parseInt(str);
        if(num>=0 && num<=255){
            return true;
        }
        return false;
    }

    class IPAddr{
        String A;
        String B;
        String C;
        String D;
        IPAddr(String w,String x,String y, String z){
            this.A = w;
            this.B = x;
            this.C = y;
            this.D = z;
        }
        @Override
        public String toString(){
            StringBuilder ipAddress = new StringBuilder();
            ipAddress.append(A);
            ipAddress.append(".");
            ipAddress.append(B);
            ipAddress.append(".");
            ipAddress.append(C);
            ipAddress.append(".");
            ipAddress.append(D);            
            return ipAddress.toString();
        }
    }
}