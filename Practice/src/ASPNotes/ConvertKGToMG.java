package ASPNotes;

import java.util.Scanner;

public class ConvertKGToMG {

	public static void main(String args[])
	{
		System.out.println("Enter 1 to convert KG to MG and 0 to convert MG to KG");
		Scanner obn = new Scanner(System.in);
		double a =obn.nextInt();
		if (a==1)
		{
			System.out.println(" Enter a value to convert KG to MG");
			double b = obn.nextFloat();
			System.out.println(" This is your required MG "+(b*1000));
		}
		else if (a==0)
		{
			System.out.println(" Enter a value to convert MG to KG");
			double b = obn.nextFloat();
			System.out.println(" This is your required KG "+b/1000);
		}
		else
		{
			System.out.println(" Invalid No.");
		}
	}
}
