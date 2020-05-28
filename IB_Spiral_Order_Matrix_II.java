import java.util.ArrayList;

class IB_Spiral_Order_Matrix_II{
    public static void main(String[] args) {
        
    }
    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        int left = 0;
        int right = A-1;
        int top = 0;
        int botton = A-1;
        int i=1;
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        for(int k=0;k<A;k++){
            result.add(new ArrayList<>());
            for(int j=0;j<A;j++){
                result.get(i).add(0);
            }
        }
        while(i<=A*A){
            for(int j=left;j<=right;j++){
                result.get(top).remove(j);
                result.get(top).add(i);
                if(j==right){
                    top++;
                }
                i++;
            }
            for(int j=top;j<=botton;j++){
                result.get(j).remove(right);
                result.get(j).add(right,i);
                if(j==botton){
                    right--;
                }
                i++;
            }
            for(int j=right;j>=left;j--){
                result.get(botton).remove(j);
                result.get(botton).add(j,i);
                if(j==left){
                    botton--;
                }
                i++;
            }
            for(int j=botton;j>=top;j--){
                result.get(j).remove(left);
                result.get(j).add(left,i);
                if(j==top){
                    left++;
                }
                i++;
            }
        }
        return result;
    }
}