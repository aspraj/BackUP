package assignment3;

import java.util.Scanner;

public class StringSearch {

	public static void main(String args[]) {
	
	String arr[] = {"aman","Singh","Patel","Rajput"};
	
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter the String to see it is present in array or not");
	String c= obj.nextLine();
			
//	for (int i=0; i<arr.length;i++)
//	{	boolean asp = arr[i] == c.equalsIgnoreCase(c);
	if (arr[i] == c.equalsIgnoreCase(c))
	{
		System.out.println("The no entered by the user is present at "+arr[i-1]+" position");
		break;
	}
	}
	
	
	
	}


}
