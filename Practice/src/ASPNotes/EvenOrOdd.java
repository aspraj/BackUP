package ASPNotes;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String args[])
	{
		int a ;
		System.out.println("Enter a no");
		Scanner obj = new Scanner(System.in);
		a=obj.nextInt();
		if (a%2==0)
		{
			System.out.println("No is Even");
		}
		else
		{
			System.out.println("No is Odd");
		}
				
	}
}
