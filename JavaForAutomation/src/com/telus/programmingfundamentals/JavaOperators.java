package com.telus.programmingfundamentals;

public class JavaOperators {

	public static void main(String[] args) {
		
		// 1. Assignment Operator
		int num1 = 20;
		int num2 = 50;
		int num3 = 60;
		
		// 2. Arithmetic Operator
		
		// Addition
		// Adding any two number
		System.out.println(num1 + num3);
		
		// Subtraction
		System.out.println(num2 - num1);
		
		// Multiplication
		System.out.println(num1 * num3);
		
		// Division
		System.out.println(num3/num1);
		
		// Remainder
		System.out.println(num2%num1);
		System.out.println("The remainder of num2 and num1 is "+ (num2%num1));
		
		
		// Equality and relational operators
		
		int num4 = 200;
		int num5 = 300;
		int num6 = 200;
		
		System.out.println(num4 == num6);
		System.out.println(num4 >= num5);
		System.out.println(num4 <= num5);
		System.out.println(num5 != num6);
		System.out.println("This is equality and relational operators");
		
		// Conditional operator
		// And - &&
		System.out.println(num4==num6 && num4<=num6);
		System.out.println(num4==num6 && num4>=num5);
		System.out.println("This is conditional operator");
		
		// OR - ||
		System.out.println(num4==num6 || num4<=num6);
		System.out.println(num4==num6 || num4<=num5);
		System.out.println(num4>num6 || num4>num5);
		
		// Unary operator
		int i = 20;
		// Pre-Increment:-
		// ++i => i=i+1
		int j = ++i;
		System.out.println("The value of i = "+ i);
		System.out.println("The value of j = "+ j);
		
		// Post- Increment
		// i++ => First it will assign the value and then only it will increment
		int a = 20;
		int b = a++;
		System.out.println("The value of a = "+ a);
		System.out.println("The value of b = "+ b);
		
	
		
		
				
		

	}

}
