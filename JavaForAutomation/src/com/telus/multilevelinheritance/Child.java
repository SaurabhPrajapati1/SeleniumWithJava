package com.telus.multilevelinheritance;

public class Child extends Parent{              // child class
		
	public void childMethod() {                 // child method
		System.out.println("I am the Child");
	}

	public static void main(String[] args) {
		
		Child obj = new Child();
		obj.childMethod();
		obj.parentMethod();

	}

}
