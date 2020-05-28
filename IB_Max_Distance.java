import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*

Given an array A of integers, find the maximum of j - i subjected to the constraint of A[i] <= A[j].

If there is no solution possible, return -1.

Example :

A : [3 5 4 2]

Output : 2 
for the pair (3, 4)

*/


class IB_Max_Distance{
    public static void main(String[] args) {
    }
    public int maximumGap_Approach1_WithoutModifyingArray(final List<Integer> A) {
        int B[]=new int[A.size()];
        B[0]=-1;
        for(int i=1;i<A.size();i++){
            if(A.get(i)>=A.get(i-1)){
                int index = i-1;
                int val = B[i-1];
                while(val!=-1){
                    index = val;
                    val = B[val];
                }
                   boolean hasLessElement = false;
                    for(int j=0;j<=index;j++){
                        if(A.get(i)>=A.get(j)){
                            B[i]=j;
                            hasLessElement = true;
                            break;
                        }
                    }
                    if(!hasLessElement){
                        B[i]=-1;
                    }
            }else{
                if(B[i-1]==-1){
                    B[i]=B[i-1];
                }else{
                    boolean hasLessElement = false;
                    for(int j=0;j<i;j++){
                        if(A.get(i)>=A.get(j)){
                            B[i]=j;
                            hasLessElement = true;
                            break;
                        }
                    }
                    if(!hasLessElement){
                        B[i]=-1;
                    }
                }
            }
        }
        for(int i=0;i<B.length;i++){
            if(B[i]==-1){
                B[i]=i;
            }
        }
        int maxDistance = -1;
        for(int i=0;i<B.length;i++){
            int diff = i-B[i];
            if(Math.abs(diff)>maxDistance){
                maxDistance = Math.abs(diff);
            }
        }
        return maxDistance;
    }

    public int maximumGap_Approach2_UsingSorting(final List<Integer> A) {
        ArrayList<MaxDistance> arr = new ArrayList<>();
        ArrayList<Integer> sortedValuesIndexes = new ArrayList<>();

        for(int i=0;i<A.size();i++){
            arr.add(new MaxDistance(A.get(i), i));
        }
        Collections.sort(arr,new SortMaxDistance());
        for(int i=0;i<A.size();i++){
            sortedValuesIndexes.add(arr.get(i).index);
        }
        int overallMaxDistance = 0;
        int minIndexTillNow = Integer.MAX_VALUE;
        for(int i=0;i<sortedValuesIndexes.size();i++){
            if(minIndexTillNow>sortedValuesIndexes.get(i)){
                minIndexTillNow = sortedValuesIndexes.get(i);
            }
            if(sortedValuesIndexes.get(i)-minIndexTillNow > overallMaxDistance){
                overallMaxDistance = sortedValuesIndexes.get(i)-minIndexTillNow;
            }
        }
        return overallMaxDistance;
    }
}
class MaxDistance{
    int val;
    int index;
    public MaxDistance(int a, int b){
        this.val = a;
        this.index = b;
    }
}
 class SortMaxDistance implements Comparator<MaxDistance>{
    @Override
    public int compare(MaxDistance o1, MaxDistance o2) {
        return o1.val-o2.val;
    }
}