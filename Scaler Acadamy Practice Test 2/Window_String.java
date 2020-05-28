import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Window_String{
    public static void main(String[] args) {
        
    }
    public String minWindow(String A, String B) {
        HashMap<Character,Integer> hmA=new HashMap<>();
        HashMap<Character,Integer> hmB=new HashMap<>();
        for(int i=0;i<B.length();i++){
            if(hmB.containsKey(B.charAt(i))){
                hmB.put(B.charAt(i), hmB.get(B.charAt(i))+1);
            }else
            hmB.put(B.charAt(i), 1);
        }
        for(int i=0;i<A.length();i++){
            if(hmA.containsKey(A.charAt(i))){
                hmA.put(A.charAt(i), hmA.get(A.charAt(i))+1);
            }else
            hmA.put(A.charAt(i), 1);
        }
        Set<Character> keySet= hmB.keySet();
        StringBuilder sbA = new StringBuilder(A);
        StringBuilder result = new StringBuilder();
        
        Iterator it = keySet.iterator();
        while(it.hasNext()){
            Character key= (Character) it.next();
            if(hmA.get(key)<hmB.get(key)){
                return result.toString();
            }
        }
        result.append(A);
            
        return result.toString();
    }
}