package com.telus.programmingfundamentals;

public class PrimeOrNot {

	public static void main(String[] args) {
		// To check whether the number is prime or not :-
		
		int num = 12;
		int count = 0;
		
		for(int i=1; i<=num; i++) {
			if(num % i == 0) {
				count++;
			}
		}
		
		if(count==2) {
			System.out.println("The number is prime");
		}
		else
		{
			System.out.println("The number is not prime");
		}

	}

}
