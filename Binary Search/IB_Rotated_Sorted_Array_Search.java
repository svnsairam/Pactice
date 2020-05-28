import java.util.ArrayList;
import java.util.List;

public class IB_Rotated_Sorted_Array_Search {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int search(final List<Integer> A, int B) {
        int target = B;
        int low =0;
        int high = A.size();
        int mid=(low+high)/2;
        int rotatedStarting = -1;
        if(A.size()<1){
            return -1;
        }
        if(A.size()==1){
            if(A.get(0)==target){
                return 0;
            }else{
                return -1;
            }
        }
        if(A.get(0)<A.get(1)&& A.get(0)<A.get(A.size()-1)){
                    rotatedStarting = 0;
        }
        while(low<=high && rotatedStarting==-1){
            mid=(low+high)/2;
            if(mid==0){
               if(A.get(mid)<A.get(1)&& A.get(mid)<A.get(A.size()-1)){
                    rotatedStarting = mid;
                    break;
               }
            }else if(mid==A.size()-1){
              if(A.get(mid)<A.get(0) && A.get(mid)<A.get(A.size()-2)){
                    rotatedStarting = mid;
                    break;
               }
            }
            else if(A.get(mid)<A.get(mid-1)&&A.get(mid)<A.get(mid+1)){
                rotatedStarting = mid;
                break;
            }
            // when mid==0
            if(A.get(mid)>=A.get(0)){
                low=mid+1;
            }else{
                high = mid-1;
            }
        }        
        if(rotatedStarting == -1){
            return -1;
        }
        if(A.get(rotatedStarting)==target){
            return rotatedStarting;
        }
        int left = binarySearch(A,0,rotatedStarting-1,target);
        int right = binarySearch(A,rotatedStarting+1,A.size()-1,target);
        if(left == -1){
            return right;
        }else{
            return left;
        }
        
    }
    
 public int binarySearch(List<Integer> A,int low,int high,int target){
        int mid = (low+high)/2;
        while(low<=high && low>=0 && high<A.size()){
            mid = (low+high)/2;
            if(A.get(mid)==target){
                return mid;
            }
            if(A.get(mid)>target){
                high=mid-1;
            }else{
                low = mid+1;
            }
        }
        return -1;
    }
}
