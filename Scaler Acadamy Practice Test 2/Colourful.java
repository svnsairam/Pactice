import java.util.ArrayList;
import java.util.HashSet;

class Colourful{
    public static void main(String[] args) {
        
    }
    public int colorful(int A) {
        StringBuilder sb = new StringBuilder();
        
        while(A>0){
            if(A%10==0 || A%10==1){
                return 0;
            }
            for(int i=0;i<sb.length();i++){
                if(sb.charAt(i)==A%10){
                    return 0;
                }
            }
            sb.append(A%10);
            A=A/10;
        }
        for(int i=0;i<sb.length()-1;i++){
            if((sb.charAt(i)=='2'&&sb.charAt(i)=='3')|| (sb.charAt(i)=='3'&&sb.charAt(i)=='2') && (sb.charAt(i)=='6' || sb.charAt(i+1)=='6')){
                return 0;
            }else if((sb.charAt(i)=='2'&&sb.charAt(i)=='4')|| (sb.charAt(i)=='4'&&sb.charAt(i)=='2') && (sb.charAt(i)=='8' || sb.charAt(i+1)=='8')){
                return 0;
            }
        }
        
        return 1;

    }
}