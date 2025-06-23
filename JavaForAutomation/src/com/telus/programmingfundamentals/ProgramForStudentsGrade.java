package com.telus.programmingfundamentals;

public class ProgramForStudentsGrade {

	public static void main(String[] args) {
		
		// Using if else if ladder write a java program for students grade:-
		
		int studentMarks = 100;
		
		if(studentMarks>=80) {
			System.out.println("The Student Marks is " + studentMarks + " and the student grade is O.");
		}
		else if(studentMarks>=75 && studentMarks<=79) {
			System.out.println("The Student Marks is " + studentMarks + " and the student grade is A.");
		}
		else if(studentMarks>=70 && studentMarks<=74) {
			System.out.println("The Student Marks is " + studentMarks + " and the student grade is B.");
		}
		else if(studentMarks>=60 && studentMarks<=69) {
			System.out.println("The Student Marks is " + studentMarks + " and the student grade is C.");
		}
		else if(studentMarks>=50 && studentMarks<=59) {
			System.out.println("The Student Marks is " + studentMarks + " and the student grade is D.");
		}
		else if(studentMarks>=45 && studentMarks<=49) {
			System.out.println("The Student Marks is " + studentMarks + " and the student grade is E.");
		}
		else if(studentMarks>=40 && studentMarks<=44) {
			System.out.println("The Student Marks is " + studentMarks + " and the student grade is P.");
		}
		else
		{
			System.out.println("The Student Marks is " + studentMarks + " and the student grade is F(Fail).");
		}

		
		

	}

}
