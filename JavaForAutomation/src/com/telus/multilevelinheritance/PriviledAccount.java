package com.telus.multilevelinheritance;

public class PriviledAccount extends SavingAccount{
	
	public void debitCard(int accNum) {
		System.out.println("The debit card dispatched to the customer " + accNum);
		System.out.println("The priviled account class is executed");
	}

	public static void main(String[] args) {
		
		PriviledAccount PersonTwo = new PriviledAccount();
		PersonTwo.deposit();
		PersonTwo.withdrawal();
		PersonTwo.viewSummary(98765);
		PersonTwo.debitCard(12345);
	
		

	}

}
