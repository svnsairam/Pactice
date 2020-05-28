import java.util.ArrayList;
import java.util.Collections;

class Conditional_Swaps{
    public static void main(String[] args) {
    
    }
    public String solve(int A, ArrayList<Integer> B, String C) {
        int startingIndex =0;
        int endingIndex=0;
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<C.length();i++){
            if(C.charAt(i)=='0'&&i==C.length()-1){
                endingIndex = i;
                ArrayList<Integer> subList = new ArrayList<>();
                subList.addAll(B.subList(startingIndex, endingIndex+1));
                Collections.sort(subList);
                result.addAll(subList);
                startingIndex = i+1; 
                result.add(B.get(B.size()-1));
            }
            if(C.charAt(i)=='0' && i!=C.length()-1){
                endingIndex = i;
                ArrayList<Integer> subList = new ArrayList<>();
                subList.addAll(B.subList(startingIndex, endingIndex+1));
                Collections.sort(subList);
                result.addAll(subList);
                startingIndex = i+1;
            }if(C.charAt(i)=='1' && i==C.length()-1){
                ArrayList<Integer> subList = new ArrayList<>();
                subList.addAll(B.subList(startingIndex, B.size()));
                Collections.sort(subList);
                result.addAll(subList);
            }
        }

        for(int i=0;i<result.size();i++){
            if(result.get(i)!=i+1){
                return "NO";
            }
        }
        return "YES";
    }
}