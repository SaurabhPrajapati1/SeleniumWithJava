package com.telus.programmingfundamentals;

public class ThrowKeyword {

	public static void main(String[] args) {

		int age = 16;

		if(age<18) {
			throw new ArithmeticException("Not valid age to vote");
		}
		else
		{
			System.out.println("Valid age to vote !!!");
		}


	}

}
