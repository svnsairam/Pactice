/*
Given a string, find the rank of the string amongst its permutations sorted lexicographically.
Assume that no characters are repeated.

Example :

Input : 'acb'
Output : 2

The order permutations with letters 'a', 'c', and 'b' : 
abc
acb
bac
bca
cab
cba
The answer might not fit in an integer, so return your answer % 1000003

*/ 




import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.stream.Collector;

class IB_Sorted_Permutation_Rank{
public static void main(String[] args) {
    
}
public int findRank(String A) {
    ArrayList<AlphabetValues> arr = new ArrayList<>();
    for(int i=0;i<A.length();i++){
        arr.add(new AlphabetValues(A.charAt(i), A.charAt(i)));
    }
    Collections.sort(arr,new SortedAlphabetValues());
    HashMap<Character,Integer> hm = new HashMap<>();
    for(int i=0;i<arr.size();i++){
        hm.put(arr.get(i).x, i);
    }
    int givenOrderArray[]=new int[hm.size()];
    for(int i=0;i<hm.size();i++){
        givenOrderArray[i]=hm.get(A.charAt(i));
    }
    long sum =0;
    for(int i=0;i<givenOrderArray.length;i++){
        sum = sum + (givenOrderArray[i]%1000003*factorial(givenOrderArray.length-1-i)%1000003)%1000003;
        for(int j=i+1;j<givenOrderArray.length;j++){
            if(givenOrderArray[j]>givenOrderArray[i]){
                givenOrderArray[j]=givenOrderArray[j]-1;
            }
        }
    }
    sum = (sum+1)%1000003;
    return (int)sum%1000003;
}
public long factorial(int x){
    long ans = 1;
    for(int i=x;i>=2;i--){
        ans = (ans * i%1000003)%1000003;
    }
    return ans;
}
class AlphabetValues{
    char x;
    int val;
    AlphabetValues(char a, int b){
        x = a;
        val = b;
    }
}
class SortedAlphabetValues implements Comparator<AlphabetValues>{

    @Override
    public int compare(AlphabetValues o1, AlphabetValues o2) {
        // TODO Auto-generated method stub
        return o1.val-o2.val;
    }

}
}