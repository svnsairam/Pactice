import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class IB_Add_One_To_Number {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input[] = br.readLine().split(" ");
        ArrayList<Integer> arr = new ArrayList<Integer>();
       for(int i=0;i<input.length;i++){
           arr.add(Integer.parseInt(input[i]));
       } 
        System.out.println(new IB_Add_One_To_Number().plusOne(arr));
    }
     public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int count = 1;
        for(int i=0;i<A.size();i++){
            if(A.get(A.size()-1-i)==9 && count == 1){
                A.set(A.size()-1-i, 0);
            }else{
                if(count ==1)
                {A.set(A.size()-1-i, A.get(A.size()-1-i)+count);
                count = 0;
            }
            }
        }
        ArrayList<Integer> arr = new ArrayList<>();

        if(count == 1){
            arr.add(count);
            for(int i=0;i<A.size();i++){
                arr.add(A.get(i));
            }
        }else{
            arr = A;
        }
        System.out.println(arr);

        while(arr.size()>0){
            System.out.println(arr);
            if(arr.get(0)==0){
                arr.remove(0);
            }else{
                break;
            }
        }
        return arr;
    }
}