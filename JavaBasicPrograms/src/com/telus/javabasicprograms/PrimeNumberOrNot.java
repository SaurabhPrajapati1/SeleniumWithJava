package com.telus.javabasicprograms;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		
		int num=67;
		int factorcount=0;
		
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				factorcount++;
			}
			
		}
		if(factorcount==2) {
			System.out.println(num + " is a Prime Number.");
		}
		else {
			System.out.println(num + " is not a Prime Number.");
		}

	}

}
