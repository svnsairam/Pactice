/*
Following is the algorithm to find all the prime numbers less than or equal to a given integer n by Eratosthenes’ method:

1. Create a list of consecutive integers from 2 to n: (2, 3, 4, …, n).
2. Initially, let p equal 2, the first prime number.
3. Starting from p2, count up in increments of p and mark each of 
these numbers greater than or equal to p2 itself in the list. 
4. These numbers will be p(p+1), p(p+2), p(p+3), etc..
5. Find the first number greater than p in the list that is not marked. 
If there was no such number, stop. Otherwise, let p now equal this number (which is the next prime), 
and repeat from step 3.
*/ 

import java.util.ArrayList;

class Algo_Sieve_of_Eratosthenes{
public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<Integer>();
    arr.add(5);
    arr.add(7);
    arr.add(0, 1);
    System.out.println(arr);
}
boolean[] sieveOfEratosthenes(int input) 
	{ 
		boolean prime[] = new boolean[input+1]; 
		for(int i=0;i<input;i++) 
			prime[i] = true; 
		for(int p = 2; p*p <=input; p++) 
		{ 
			if(prime[p] == true) 
			{ 
				for(int i = p*p; i <= input; i += p) 
					prime[i] = false; 
			} 
		}
		return prime;
	}
}