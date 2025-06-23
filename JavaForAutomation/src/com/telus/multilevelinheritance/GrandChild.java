package com.telus.multilevelinheritance;

public class GrandChild extends Child{                 // grand child class
	
	public void grandChildMethod() {                   // grand child method
		
		System.out.println("I am the Grand Child");
	}

	public static void main(String[] args) {
		
		GrandChild objTwo = new GrandChild();
		objTwo.grandChildMethod();
		objTwo.childMethod();
		objTwo.parentMethod();
		

	}

}
