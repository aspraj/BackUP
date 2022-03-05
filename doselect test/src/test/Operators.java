package test;

import java.util.Scanner;

class Activity {
	String string1;
	String string2;
	String operator;

	public Activity(String string1, String string2, String operator) {
		super();
		this.string1 = string1;
		this.string2 = string2;
		this.operator = operator;
	}
}

public class Operators {

//Implement the two function given in description in here...
//method definitions:
	public String handleException(String string1, String string2, String operator) {
		return operator;

	}

	public String doOperation(String string1, String string2, String operator) {

		try {
			switch (operator) {
			case "+": {
				String result = string1.concat(string2);
				System.out.println(result);
				break;
			}
			case "-": {
				String result = string1.replace(string2, "");
				System.out.println(result);
				break;
			}
			case "operator.equals(null) || string1.equals(null) == true || string2.equals(null) == true": {
				throw new NullPointerException();
			}
			default:
			{
				throw new NullPointerException();
			}
			}
		} catch (NullPointerException e) {
			System.out.println("Null value found");
		}
//		try {
//		if (string1.equals(null) == true || string2.equals(null) == true) {
//			throw new NullPointerException();
//		} else if (operator.equals("+")) {
//			String result = string1.concat(string2);
//			System.out.println(result);
//		} else if (operator.equals("-")) {
//			String result = string1.replace(string2, "");
//			System.out.println(result);
//		}}
//		catch(NullPointerException e)
//		{
//			System.out.println("Null value found");
//		}
		return string1;
	}

//					visibility: public
	public static void main(String args[]) throws Exception {
		// Write your own main to check the program...
		Scanner ob = new Scanner(System.in);
		String String1 = ob.nextLine();
		String String2 = ob.nextLine();
		String operator = ob.nextLine();

		Activity a = new Activity(String1, String2, operator);
		Operators source = new Operators();
		String op = source.doOperation(String1, String2, operator);
		String ex = source.handleException(String1, String2, operator);

	}
}
