package studio3;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("SIEVE OF ERATOSTHENES!!!");
		System.out.println("Choose a value of n to test: ");
		int number= in.nextInt();
		//make a boolean array that goes up to number n
		boolean[] primeNums = new boolean[number +1];
		//^^ arrays start at 0 so we need to start it at the beginning + 1
		//initialize variable i in for loop
		for (int i=0; i < primeNums.length; i++)
		{
			//set all values of i as true by default
			primeNums [i] = true;
		}	
			//test to see if any number in the array is the square of a prime number
			//if j hasn't been marked as composite, this will test j to see if it is a square
			
		
		for(int j = 2; j*j <=number; j++)
			{
				if (primeNums [j] == true)
				{
				// if j hasn't been marked as composite, this will mark all multiples of j as so
				for (int k = j*j; k<= number; k+=j)	
				{	
					//sets boolean to false, will print
					primeNums [k] = false;
				}		
				}
			}
		
		
		System.out.println("Prime numbers less than " + number + ":");
		for (int zebra = 2; zebra <= number; zebra++)	
			{
				if (primeNums[zebra] == true)
				{
				//now we print out all numbers that have been marked as composite
					System.out.print(zebra + " ");
				}
				}
		
	}
}


