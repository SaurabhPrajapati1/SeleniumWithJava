package com.telus.programmingfundamentals;

public class JavaBuiltInMethods {

	public static void main(String[] args) {
		
		// java BuiltInMethods :-
		
		String msg = "Welcome To My World";
		
		// 1. length() method - It counts the characters in the given string message and it counts space also.
		System.out.println(msg.length());
		
		
		// 2. toLowerCase() - Converts all string message to capital letters.
		System.out.println(msg.toLowerCase());
		
		
		// 3. toUpperCase() - Converts all string message to capital letters.
		System.out.println(msg.toUpperCase());
		
		
		// 4. trim() - Returns a copy of the string message, with leading and trailing whitespace omitted.
		String name = " RajKumar ";
		System.out.println(name);
		System.out.println(name.trim());
		
		
		// 5. concat() - This method returns by combining both the strings.
		String name1 = "Rahul";
		String name2 = "Shanu";
		String name3 = "Sidhu";
		
		System.out.println(name1 + name2);
		System.out.println(name1.concat(name2).concat(name3));
		System.out.println("Welcome " + name1);
		
		
		/*
		 * ASCII
		 * A TO Z (65 TO 90) value for upper case alphabets.
		 * a to z (97 to 122) value for lower case alphabets.
		 */
		
		// String Comparison
		// Two way comparison - This method returns true if the string are equal; otherwise false.
		// 6. equals()
		String value1 = "Rahul";
		String value2 = "RahuL";
		
		System.out.println(value1 == value2);
		System.out.println(value1.equals(value2));
		System.out.println(value1.equalsIgnoreCase(value2));
		
		// Three way comparison
		// 7. compareTo() - It compares the given string with current string index based(order).It returns positive number, negative number or 0.
		
		String value3 = "abhinay";
		String value4 = "Abhinay";
		
		System.out.println(value3.compareTo(value4));
		System.out.println(value4.compareTo(value3));
		System.out.println(value3.compareToIgnoreCase(value4));
		
		
		// 8. charAt()- Return the character of the mentioned index value.
		String message = "Hello World";
		System.out.println(message.charAt(6));
		
		
		// 9. indexOf() - It returns the specified character.
		System.out.println(message.indexOf('W'));
		System.out.println(message.indexOf('e'));
		System.out.println(message.indexOf('o',7));
		
		
		// 10. contains() - Return true if the string contains specific characters.
		String courseMsg = "My course name is QA Automation and its course ID is 12345";
		System.out.println(courseMsg.contains("QA Automation"));
		
		
		// 11. substring() - It returns a part of the the string.
		String transaction = "The transaction of Raj is 0987-6543-2109";
		String input = "Selenium Traning";
		System.out.println(transaction.substring(19));
		System.out.println(transaction.substring(19,22));
		System.out.println(transaction.substring(26));
		
		System.out.println(input.substring(8));
		
		
		// 12. replace() - A string replacing all the old character/word with new one.
		String welcomeMsg = "Welcome to the KOTAK BANK.";
		String updateMsg = welcomeMsg.replace("KOTAK","UNION");
		System.out.println(updateMsg);
		String updateChar = updateMsg.replace('t', 'T');
		System.out.println(updateChar);
		
		
		// 13. Handling Special Characters - Because strings must be written within quotes, Java will misunderstand this string, and generate an error.
		String textMsg = "Welcome to \"Java Online Class\".";
		System.out.println(textMsg);
		
		
		// 14. split() - It will split the string message 
		// .(dot) will not work
		String newMsg = "Hello : To : Java : Class";
		String arrWords[] = newMsg.split(":");
		for(String iArr:arrWords) {
			System.out.println(iArr);
			
		}
		
		String msgTwo = "Welcome to the Java Class. Java is very easy language. Java is my favourite language. Java is best language to learn.";
		
		// The total count of the word Java
		// Use split method("")
		String arrMsg[] = msgTwo.split("Java");
		for(String iArr:arrMsg) {
			System.out.println(iArr);
			
		}
		
		System.out.println(arrMsg.length-1);
		
		
		
		
		
	
		
		
		

	}

}
