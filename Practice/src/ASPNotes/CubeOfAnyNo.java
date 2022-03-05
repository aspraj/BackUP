package ASPNotes;

import java.util.Scanner;

public class CubeOfAnyNo
{
	public static void main(String args[])
	{
		int a ;
		int b ;
		System.out.println("Enter two no");
		Scanner obj = new Scanner (System.in);
		a= obj.nextInt();
		b= obj.nextInt();
		int c= a+b ;
		System.out.println("cube of "+a+" and "+b+" is "+(c*c*c));
	}
}
