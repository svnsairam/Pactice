
/*
The algorithm is based on below facts.

If we subtract smaller number from larger (we reduce larger number), GCD doesn’t change. So if we keep subtracting repeatedly the larger of two, we end up with GCD.
Now instead of subtraction, if we divide smaller number, the algorithm stops when we find remainder 0.
Below is a recursive function to evaluate gcd using Euclid’s algorithm.
*/ 
class Algo_Euclidean_Algorithms{
// extended Euclidean Algorithm 
public static int gcd(int a, int b) 
{ 
    if (a == 0) 
        return b; 
      
    return gcd(b%a, a); 
} 
// Driver Program 
public static void main(String[] args) 
{ 
    int a = 10, b = 15, g; 
    g = gcd(a, b); 
    System.out.println("GCD(" + a +  " , " + b+ ") = " + g); 
      
    a = 35; b = 10; 
    g = gcd(a, b); 
    System.out.println("GCD(" + a +  " , " + b+ ") = " + g); 
      
    a = 31; b = 2; 
    g = gcd(a, b); 
    System.out.println("GCD(" + a +  " , " + b+ ") = " + g); 

} 
}