package ASPNotes;

import java.util.Scanner;

public class WhoIsBiggerInBetweenABC {

	public static void main(String args[])
	{
		System.out.println(" Enter three no");
		Scanner obj = new Scanner (System.in);
		int a = obj.nextInt();
		int b = obj.nextInt();
		int c = obj.nextInt();
		
		if (a>b && a>c)
		{
			System.out.println(a+" is bigger");
		}
		else if (b>a && b>c)
		{
			System.out.println( b+" is bigger");
		}
		else{
			System.out.println(c+" is bigger");
		}
	}
}
