package com.telus.programmingfundamentals;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Raj");
		map.put(2, "Rahul");
		map.put(3, "Shanu");
		map.put(4, "Rahul");
		System.out.println(map);

		for(Map.Entry<Integer, String> m:map.entrySet()) {
			System.out.println(m.getKey() + "," + m.getValue());			
		}

		// Removing the values :-
		map.remove(2);
		System.out.println(map);

		map.remove(1, "Raj");
		System.out.println(map);

		map.replace(3, "Saurabh");
		System.out.println(map);


		HashMap<String, String> empDetails = new HashMap<String, String>();
		empDetails.put("firstName", "Saurabh");
		empDetails.put("lastName", "Kumar");
		empDetails.put("gender", "Male");
		empDetails.put("emailId", "Saurabhgzb1997@gmail.com");
		empDetails.put("mobileNumber", "9818922698");
		empDetails.put("city", "Noida");
		empDetails.put("city", "Delhi"); // Always consider the last updated value



		System.out.println(empDetails);

		System.out.println("******************Methods**********************");

		System.out.println(empDetails.size());

		System.out.println(empDetails.get("emailId"));
		System.out.println(empDetails);

		System.out.println(empDetails.remove("city"));
		System.out.println(empDetails);

		System.out.println(empDetails.remove("emailId", "r.rajkumar1514@gmail.com"));
		System.out.println(empDetails);

		System.out.println(empDetails.replace("lastName", "Bhardwaj"));
		System.out.println(empDetails);

		System.out.println("***************for each*********************");

		for(Map.Entry<String, String> details:empDetails.entrySet()) {
			System.out.println(details.getKey() + "-->" + details.getValue());
		}

		System.out.println("*********************************************");

		HashMap<Integer,HashMap<String,String>> empOne = new HashMap<Integer,HashMap<String,String>>();
		empOne.put(123456, empDetails);
		System.out.println(empOne);

		System.out.println("*********************************************");








	}



}
