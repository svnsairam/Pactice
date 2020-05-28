import java.util.ArrayList;

/*
Give a N*N square matrix, return an array of its anti-diagonals. Look at the example for more details.
Input: 	

1 2 3
4 5 6
7 8 9

Return the following :

[ 
  [1],
  [2, 4],
  [3, 5, 7],
  [6, 8],
  [9]
]
*/

class IB_Anti_Diagonals{
    public static void main(String[] args) {
        
    }
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        if(A.size()>0){
            int top = 0;
            int left =0;
            int right = A.get(top).size()-1;
            int bottom = A.size()-1;
            int i=0;
            ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
                while(i<=right && top<=bottom){
                    result.add(new ArrayList<Integer>());
                    int tempTop = top;
                    for(int j=i;j>=left;j--){
                        result.get(result.size()-1).add(A.get(tempTop).get(j));
                        tempTop++;
                    }
                    tempTop--;
                    if(tempTop>=bottom){
                            left++;
                        }
                    if(i==right){
                        top++;
                        i = right;
                    }else{
                      i++;
                    }
                }
            return result;
        }
        else
        return A;
    }
}