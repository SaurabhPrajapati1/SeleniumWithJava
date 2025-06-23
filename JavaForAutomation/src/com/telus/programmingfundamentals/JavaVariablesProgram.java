package com.telus.programmingfundamentals;

public class JavaVariablesProgram {
	
	// Instance Variables of Student Details :-
	String stuName = "Raj";
	int stuId = 12345;
	float stuFees = 12345.56f;
	String stuAddress;
	int stuMobile;
	float stuMarks;
	
	// Static Variables of Student Details :-
	static String collegeName = "GNIOT";
	static int collegeCode = 32;
	static String universityName = "AKTU";
	
	
	
	

	public static void main(String[] args) {
		
		// Object creation for instance variables :-
		JavaVariablesProgram stuDetails = new JavaVariablesProgram();
		System.out.println("The Student name is " + stuDetails.stuName);
		System.out.println("The Student ID is " + stuDetails.stuId);
		System.out.println("The Student Fees is " + stuDetails.stuFees);
		
		// There is no need to create object for static variables :-
		// It will directly print without any object creation.
		System.out.println("The Student college name is " + collegeName);
		System.out.println("The Student college code is " + collegeCode);
		System.out.println("The Student university name is " + universityName);
		
		/* If there is no assigned value to instance variables,
		 * it will give default value in the output while execution.
		 */
		System.out.println("The Student address is " + stuDetails.stuAddress);
		System.out.println("The Student mobile number is " + stuDetails.stuMobile);
		System.out.println("The Student marks is " + stuDetails.stuMarks);
		
		
		
		
		
	
		

	}

}
