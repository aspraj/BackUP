package ASPNotes;

import java.util.*;
public class WhoIsEligibleForVote {

	public static void main(String args[])
	{
		System.out.println(" Enter 1 if you are indian Enter 0 if you are not an indian");
		Scanner obj = new Scanner(System.in);
		int a = obj.nextInt();
		if (a==1)
		{
			System.out.println(" Enter your age");
			int b = obj.nextInt();
			if (b>=18)
			{
				System.out.println("You are eligible to vote");
			}
			else
			{
				System.out.println(" You are not eligible to vote");
			}
		}
		else
		{
			System.out.println("You are not eligible");
		}
	}
}
