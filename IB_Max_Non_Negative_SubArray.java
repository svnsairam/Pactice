
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class IB_Max_Non_Negative_SubArray{
    public static void main( String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input[] = br.readLine().split(" ");
        ArrayList<Integer> arr = new ArrayList<Integer>();
       for(int i=0;i<input.length;i++){
           arr.add(Integer.parseInt(input[i]));
       } 
       System.out.println(maxset(arr));
    }

    public static ArrayList<Integer> maxset( ArrayList<Integer> A) {
         ArrayList<SubSetSum> arr = new ArrayList<SubSetSum>();
        long sum = -1;
        int startingIndex =0;
        for(int i=0;i<A.size();i++){
            if(A.get(i)>=0){
                if(sum == -1){
                    startingIndex = i;
                    sum = 0;
                }
                sum = sum+A.get(i);
            }else{
                if(sum>=0){
                    arr.add(new SubSetSum(sum, startingIndex, i-startingIndex));
                    sum = -1;
                }
            }
        }
        if(sum>=0){
            arr.add(new SubSetSum(sum, startingIndex, A.size()-startingIndex));
        }
        if(arr.size()>1){
           Collections.sort(arr, new SortSubArray());
        }
        
        if(arr.size()>0){
            return  new ArrayList<>(A.subList(arr.get(0).startingIndex,
                    arr.get(0).startingIndex + arr.get(0).length));
        }else
        return new ArrayList<>();
    }
}

class SubSetSum{
    long sum;
    int startingIndex;
    int length;
    SubSetSum( long x, int y,  int z){
        this.sum = x;
        this.startingIndex = y;
        this.length = z;            
    }
    // Used to print student details in main() 
    public String toString() 
    { 
        return this.sum + " " + this.startingIndex + 
                           " " + this.length; 
    } 
}
    class SortSubArray implements Comparator<SubSetSum> {

        @Override
        public int compare(SubSetSum p1, SubSetSum p2) {
            if(p1.sum != p2.sum){
                if(p2.sum - p1.sum<0){
                    return -1;
                }else return 1;
            }else if(p1.length != p2.length){
                return p2.length - p1.length;
            }else{
                return p1.startingIndex - p2.startingIndex;
            }
        }

    }

