import java.util.ArrayList;

class IB_PRETTYPRINT{
    public static void main(String[] args) {
        System.out.println(prettyPrint(3));
    }
    public static ArrayList<ArrayList<Integer>> prettyPrint(int A) {
        int num = 2*A-1;
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<num;i++){
            result.add(new ArrayList<>());
            for(int j=0;j<num;j++){
                result.get(i).add(j,8);
            }
        }
        int level=0;
        int k = A;
        int end = num;
        while(level<=num/2){
            for(int j=level;j<end-level;j++){
                result.get(level).remove(j);
                result.get(level).add(j,k);
            }
            for(int jj=level;jj<end-level;jj++){
                result.get(end-level-1).remove(jj);
                result.get(end-level-1).add(jj,k);
            }
            for(int i=level;i<end-level;i++){
                result.get(i).remove(level);
                result.get(i).add(level, k);
            }
            for(int i=level;i<end-level;i++){
                result.get(i).remove(end-level-1);
                result.get(i).add(end-level-1, k);
            }
            k--;
            level++;
        }
        return result;
    }
}