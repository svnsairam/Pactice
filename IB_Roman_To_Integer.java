import java.util.HashMap;

class IB_Roman_To_Integer{
    public static void main(String[] args) {
        
    }
    public int romanToInt(String A) {
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);


        int sum = 0;
        int i=0;
        for(i=0;i<A.length()-1;){
            if(hm.get(A.charAt(i))<hm.get(A.charAt(i+1))){
                sum = sum + hm.get(A.charAt(i+1));
                sum = sum - hm.get(A.charAt(i));
                i = i+2;
            }
            else{
                sum = sum + hm.get(A.charAt(i));
                i++;
            }
        }

        if(i==A.length()-1){
            sum = sum + hm.get(A.charAt(i));
        }

        return sum;
    }
}