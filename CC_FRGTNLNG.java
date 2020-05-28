import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

class CC_FRGTNLNG{
    public static void main(String[] args) {
        try {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-->0){
            HashSet<String> hs = new HashSet<String>();
            String input1[] = br.readLine().split(" ");
            String input2[] = br.readLine().split(" ");
            for(int i=0;i<Integer.parseInt(input1[1]);i++){
                String input3[] = br.readLine().split(" ");
                for(int j=1;j<input3.length;j++){
                    hs.add(input3[j]);
                }
            }
            for(int i=0;i<input2.length-1;i++){
                if(hs.contains(input2[i])){
                    System.out.println("YES"+" ");
                }else{
                    System.out.println("NO"+" ");
                }
            }
            if(hs.contains(input2[input2.length-1])){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
        catch (Exception e) {
			e.printStackTrace();
		}
    }
}