package ASPNotes;

import java.util.Scanner;

public class NoIsNegativeOrPositive {

	public static void main(String args[])
	{
		int a ;
		System.out.println("Enter a no to know it is positve or negative");
		Scanner obj = new Scanner(System.in);
		a=obj.nextInt();
		
	
		if (a<0)
		{
			System.out.println("No is Negative");
		}
		else {
			System.out.println("No is Positive");
		}
	}
}
