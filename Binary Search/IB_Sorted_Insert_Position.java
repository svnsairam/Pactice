import java.util.ArrayList;

class IB_Sorted_Insert_Position{

    public int searchInsert(ArrayList<Integer> a, int b) {
        int low = 0;
        int high=a.size()-1;
        int mid=0;
        if(a.size()<=0){
            return 0;
        }
        if(b<a.get(0)){
            return 0;
        }
        if(b>a.get(a.size()-1)){
            return a.size();
        }
        while(low<=high){
            mid=(low+high)/2;
            if(a.get(mid)==b){
                return mid;
            }
            if(mid!=0){
                if(a.get(mid-1)<b && a.get(mid)>b){
                    return mid;
                }
            }
            
            if(a.get(mid)<b){
                low = mid+1;
            }
            if(a.get(mid)>b){
                high = mid-1;
            }
        }
        return 0;
    }
}