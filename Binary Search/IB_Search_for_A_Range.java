import java.util.ArrayList;
import java.util.List;

public class IB_Search_for_A_Range {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static void main(String[] args) {
        
    }
    public ArrayList<Integer> searchRange(final List<Integer> A, int B) {
        int low = 0;
        int high = A.size()-1;
        int mid = 0;
        int leftMostPosition = -1;
        while(low<=high){
             mid=(low+high)/2;
            if(A.get(mid)==B){
                if(mid==0){
                    leftMostPosition = mid;
                    break;
                }
                if(A.get(mid-1)<B){
                    leftMostPosition = mid;
                    break;
                }else{
                    high = mid-1;
                }
            }else if(A.get(mid)<B){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        
         low = 0;
         high = A.size()-1;
         mid = 0;
         int rightMostPosition = -1;
        while(low<=high){
             mid=(low+high)/2;
            if(A.get(mid)==B){
                if(mid==A.size()-1){
                    rightMostPosition = mid;
                    break;
                }
                if(A.get(mid+1)>B){
                    rightMostPosition = mid;
                    break;
                }else{
                    low = mid+1;
                }
            }else if(A.get(mid)<B){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        
        ArrayList<Integer> result=new ArrayList<Integer>();
        result.add(leftMostPosition);
        result.add(rightMostPosition);
        return result;         
    }
}
