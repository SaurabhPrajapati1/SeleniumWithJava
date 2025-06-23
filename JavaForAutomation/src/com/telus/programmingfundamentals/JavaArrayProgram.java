package com.telus.programmingfundamentals;

public class JavaArrayProgram {

	public static void main(String[] args) {
		
		// Alternative way of int data type java array creation:-
		int arrNum[] = {5,10,15,20,25,30,35,40,45,50};
		
		System.out.println(arrNum[6]);
		
		System.out.println("*************************************");
		
		
		// for each -array concept:-
		for(int iArr:arrNum) {
			System.out.println(iArr);
			
		}
		
		System.out.println("**************************************");
		
		
		// For string data type java array creation:-
		String arrCars[] = {"Audi","BMW","Mercedes","Mustang","Lamborgini"};
		System.out.println(arrCars[3]);
		
		System.out.println("**************************************");
		
		for(String iArr:arrCars) {
			System.out.println(iArr);
		}
		
		

	}

}
