/*
HammingDistance(2, 7) = 2, as only the first and the third bit differs in the binary representation of 2 (010) and 7 (111).

Given an array of N non-negative integers, find the sum of hamming distances of all pairs of integers in the array.
Return the answer modulo 1000000007.

Example

Let f(x, y) be the hamming distance defined above.

A=[2, 4, 6]

We return,
f(2, 2) + f(2, 4) + f(2, 6) + 
f(4, 2) + f(4, 4) + f(4, 6) +
f(6, 2) + f(6, 4) + f(6, 6) = 

0 + 2 + 1
2 + 0 + 1
1 + 1 + 0 = 8
*/
import java.util.List;

class IB_Sum_of_pairwise_Hamming_Distance{
    public static void main(String[] args) {
        
    }

    public int hammingDistance(final List<Integer> A) {
        long sum = 0;
            for(int i=0;i<A.size();i++){
                for(int j=i+1;j<A.size();j++){
                    int x = A.get(i);
                    int y = A.get(j);
                    int xorOperation = x^y;
                    int countNumberOfOnes = 0;
                    while((xorOperation&(xorOperation-1))>0){
                        countNumberOfOnes++;
                        xorOperation=xorOperation&(xorOperation-1);
                    }
                    sum = sum+countNumberOfOnes;
                }
            }
            sum = (sum*2)%1000000007;
            return (int)sum;
    }
}