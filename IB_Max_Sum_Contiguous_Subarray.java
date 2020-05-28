import java.util.List;

class IB_Max_Sum_Contiguous_Subarray{
    public static void main(String[] args) {
        
    }
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) {
        int maxTillNow = Integer.MIN_VALUE;
     int overallMax = Integer.MIN_VALUE;
     int startingIndex = 0;
     int endingIndex=A.size();
     
     for(int i=0;i<A.size();i++){
         if(A.get(i)>0){
             maxTillNow = A.get(i);
             startingIndex = i;
             endingIndex = i+1;
             break;
         }else if(A.get(i)>maxTillNow){
             maxTillNow = A.get(i);
             startingIndex = i;
         }
     }
     int count = 0;
     overallMax = maxTillNow;
     if(maxTillNow>0){
         for(int i=startingIndex+1;i<A.size();i++){
             if(maxTillNow + A.get(i)>overallMax){
                 count++;
                 overallMax = maxTillNow+ A.get(i);
                 endingIndex = i;
             }
             else if(maxTillNow+A.get(i)<0){
                 count = 0;
                 maxTillNow = 0;
                 endingIndex = i;
             }
             if(maxTillNow+A.get(i)>=0){
                 maxTillNow = maxTillNow+A.get(i);
             }
         }

         return overallMax;
     }else{
         return maxTillNow;
     }
 }
}