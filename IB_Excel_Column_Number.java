/**
Given a column title as appears in an Excel sheet, return its corresponding column number.

Example:

    A -> 1
    
    B -> 2
    
    C -> 3
    
    ...
    
    Z -> 26
    
    AA -> 27
    
    AB -> 28 
*/

class IB_Excel_Column_Number{
    public static void main(String[] args) {
    
    }
    public int titleToNumber(String A) {
        int val=1;
        long sum = 0;
        for(int i=1;i<=A.length();i++){
            val = A.length()-i;
            if(val==0){
                sum = sum+(A.charAt(i-1)-'A'+1);
            }else{
               sum = sum+(long)Math.pow(26,val)*(A.charAt(i-1)-'A'+1);
            }
            if(sum>Integer.MAX_VALUE){
                sum = 0;
                break;
            }
        }
        return (int) sum;
    }
}