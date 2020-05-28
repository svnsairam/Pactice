import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CC_LECANDY {
    public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while(T-->0){
            String input1[] = br.readLine().split(" ");
            int N = Integer.parseInt(input1[0]);
            int C = Integer.parseInt(input1[1]);
            String input2[] = br.readLine().split(" ");
            int arr[] = new int[N];
            for(int i=0;i<N;i++){
                arr[i] = Integer.parseInt(input2[i]);
            }
            long totalCandiesRequired = 0;
            for(int i=0;i<N;i++){
                totalCandiesRequired = totalCandiesRequired +arr[i];
            }
            if(totalCandiesRequired>C){
                System.out.println("No");
            }else{
                System.out.println("Yes");
            }
        }
    }
}