import java.util.ArrayList;

/*
Given numRows = 5,

Return

[
     [1],
     [1,1],
     [1,2,1],
     [1,3,3,1],
     [1,4,6,4,1]
]
*/
class IB_Pascal_Triangle{
    public static void main(String[] args) {
        
    }
    public ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(A>0){
        result.add(new ArrayList<>());
        result.get(0).add(1);  
        }
        if(A==1){
            return result;
        }
        if(A>1){
            result.add(new ArrayList<>());
            result.get(1).add(1);
            result.get(1).add(1);
            if(A==2){
                return result;
            }
        }

        if(A>2){
            for(int i=2;i<A;i++){
                result.add(new ArrayList<>());
                for(int j=0;j<=i;j++){
                    result.get(i).add(0);
                }
            }
            
            for(int i=2;i<A;i++){
                for(int k=0;k<result.size();k++){
                result.get(i).remove(0);
                result.get(i).add(0,1);
                result.get(i).remove(i);
                result.get(i).add(1);
                for(int j=1;j<i;j++){
                    result.get(i).remove(j);
                    result.get(i).add(j, result.get(i-1).get(j-1)+result.get(i-1).get(j));
                }
            }
        }
    }
            return result;
}
}