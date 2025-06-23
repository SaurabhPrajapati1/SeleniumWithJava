package com.telus.multilevelinheritance;

public class SavingAccount extends Account{
	
	public int viewSummary(int accNum) {
		System.out.println("The account summary is displayed for " + accNum);
		System.out.println("The saving account class is executed");
		return accNum;
	}
	

	public static void main(String[] args) {
		SavingAccount personOne = new SavingAccount();
		personOne.deposit();
		personOne.withdrawal();
		personOne.viewSummary(54321);
		

	}

}
