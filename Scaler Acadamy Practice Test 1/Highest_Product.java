/**
 * Find highest product of 3 numbers.
 * Solution fits into 32 bit signed Integer
 * The array can have negative numbers.
 */

import java.util.ArrayList;

class Highest_Product{
    public static void main(String[] args) {
        
    }
    public int maxp3(ArrayList<Integer> A) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for(int i=0;i<A.size();i++){
            if(A.get(i)<firstMin){
               secondMin = firstMin;
               firstMin = A.get(i);
            }else if(A.get(i)<secondMin){
               secondMin = A.get(i);
        }
        }
        for(int i=0;i<A.size();i++){
            if(A.get(i)>firstMax){
               thirdMax = secondMax;
               secondMax = firstMax;
               firstMax = A.get(i);
            }else if(A.get(i)>secondMax){
               thirdMax = secondMax;
               secondMax = A.get(i); 
            }else if(A.get(i)>thirdMax){
               thirdMax = A.get(i);
            }
        }
        if(firstMin != Integer.MAX_VALUE && secondMin != Integer.MAX_VALUE){
            if(firstMax*secondMax*thirdMax > firstMin*secondMin*firstMax){
                return firstMax*secondMax*thirdMax;
            }else{
                return firstMin*secondMin*firstMax;
            }
        }
        return firstMax*secondMax*thirdMax;
    }
}