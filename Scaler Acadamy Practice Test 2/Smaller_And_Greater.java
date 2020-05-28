import java.util.ArrayList;
import java.util.Collections;

class Smaller_And_Greater{
    public static void main(String[] args) {
        
    }
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        if(A.size()==1 || A.size()==2){
            return 0;
        }
        int small = A.get(0);
        int big = A.get(A.size()-1);
        while(A.size()>0){
            if(A.get(0)==small){
                A.remove(0);
            }else{
                break;
            }
        }

        while(A.size()>0){
            if(A.get(A.size()-1)==big){
                A.remove(A.size()-1);
            }else{
                break;
            }
        }

        return A.size();
    }
}