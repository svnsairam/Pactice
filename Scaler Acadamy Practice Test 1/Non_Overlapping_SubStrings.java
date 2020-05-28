


import java.util.ArrayList;

class Non_Overlapping_SubStrings{
    public static void main(String[] args) {
        
    }
    public String solve(String A) {
        ArrayList<Indexes> arrAB = new ArrayList<>();
        ArrayList<Indexes> arrBA = new ArrayList<>();
        for(int i=0;i<A.length()-1;i++){
            if(A.charAt(i)=='A' && A.charAt(i+1)=='B'){
                arrAB.add(new Indexes(i, i+1));
            }
            if(A.charAt(i)=='B' && A.charAt(i+1)=='A'){
                arrBA.add(new Indexes(i, i+1));
            }
        }
        for(int i=0;i<arrAB.size();i++){
            for(int j=arrBA.size()-1;j>=0;j--){
                if(arrBA.get(j).starting!=arrAB.get(i).starting && 
                arrBA.get(j).starting!=arrAB.get(i).ending && 
                arrBA.get(j).ending!=arrAB.get(i).starting &&
                arrBA.get(j).ending!=arrAB.get(i).ending){
                    return "YES";
                }
            }
        }
        return "NO";
    }

    class Indexes{
        int starting;
        int ending;
        Indexes(int a,int b){
            this.starting = a;
            this.ending = b;
        }
    }
}
