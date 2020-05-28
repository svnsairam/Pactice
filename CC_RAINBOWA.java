import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CC_RAINBOWA {
    public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while(T-->0){
            int number = Integer.parseInt(br.readLine());
            number = 0;
            String input[] = br.readLine().split(" ");
            int currentValue = 1;
            boolean isRainbow = true;
            if(input.length<13){
                System.out.println("no");
            }else{
            for(int i=0;i<=input.length/2;i++){
                if(Integer.parseInt(input[i]) == Integer.parseInt(input[input.length-i-1]) && ((currentValue+1<=7 && Integer.parseInt(input[i])==currentValue+1) || Integer.parseInt(input[i])==currentValue)){
                    if(Integer.parseInt(input[i])==currentValue+1){
                        currentValue++;
                    }
                }else {
                    isRainbow = false;
                    break;
                }
            }
            if(isRainbow && currentValue==7){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
    }
}