package com.telus.javabasicprograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter a number : ");
			
			int num=scan.nextInt();
			int rev=0;
			
			while(num>0) {
				rev=rev*10+num%10;
				num=num/10;
			}
			System.out.println("The reverse of the number is " + rev + ".");
		}

	}

}
