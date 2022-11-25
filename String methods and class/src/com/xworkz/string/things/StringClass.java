package com.xworkz.string.things;

public class StringClass {

	public static void main(String[] args) {

		String name = "sayedmurtuzaHaji";

		char alpha = name.charAt(12); // explicitly storing the address of method return

		System.out.println("using method charAt ,getting value at index  : " + alpha);

		System.out.println("using method codePointAt  : " + name.codePointAt(5));/* Printing the return value directly
																					 without storing (Returns the
																					 character (Unicode code point) at
																					 the specified index. )*/

		System.out.println("using method codePointBefore   : " + name.codePointBefore(8));/*(Returns the character
																							 (Unicode code point)
																							 before the
																							 specified index)*/
		System.out.println("using method codePointCount   : " + name.codePointCount(2, 10));

		int diff1 = name.compareTo("sayed");
		System.out.println("using method compareTo   : " + diff1);

		int diff = name.compareToIgnoreCase("SAYed");
		System.out.println("using method compareToIgnoreCase   : " + diff);

		String concatenated = name.concat(" Ameer");
		System.out.println("using method concat   : " + concatenated);/* Returns:a string that represents the
																		 concatenation of this object's characters
																		 followed by the string argument's characters.*/

		int hash = name.hashCode();
		System.out.println("using method hashCode   : " + hash);// Returns a hash code for this string

		String indented = name.indent(20);
		System.out.println("using method indent   : " + indented);
		
		boolean condition=name.endsWith("a");
		System.out.println("using method endsWith : "+condition);
		
		byte[] arr=name.getBytes();//Returns:The resultant byte array
		System.out.println("using method getBytes : "+arr[15]);//prints ascii value of particular index
		
		boolean condition1=	name.isBlank();//Returns:true if the string is empty or contains only white space codepoints,otherwise false
		System.out.println("isBlank "+condition1);
		
		boolean condition2=name.isEmpty();
		System.out.println("isEmpty "+condition2);
		
		System.out.println("contentEquals method "+name.contentEquals("sayedmurtuzaHaji"));  // true
		System.out.println("contentEquals method "+name.contentEquals("Hello"));  // false
		
		char[] myStr1 = {'H', 'e', 'l', 'l', 'o'};
	    String myStr2 = "";
	    myStr2 = String.copyValueOf(myStr1, 0, 3);
	    System.out.println("Returned String: " + myStr2);  
	    
	    
	    String myStr3= "Hello";
	    String myStr4 = "Hello";
	    String myStr5 = "Another String";
	    System.out.println(myStr3.equals(myStr4)); // Returns true because they are equal
	    System.out.println(myStr3.equals(myStr5)); // false



	    String txt = "ABEFGHjkfsgKLMNOPhsbjbik";
	    System.out.println("length "+txt.length());
	    
	    System.out.println(myStr3.replace('H', 'p'));
	    
	    System.out.println("orginal string "+txt);
	    System.out.println("lowercase "+txt.toLowerCase());
	    System.out.println("upper case "+txt.toUpperCase());


		

	}
}
