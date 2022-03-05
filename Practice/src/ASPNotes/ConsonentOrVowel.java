package ASPNotes;

import java.util.Scanner;

public class ConsonentOrVowel {

	public static void main(String args[])
	{
		char a ;
		Scanner obj = new Scanner (System.in);
		a=obj.next().charAt(0);
		switch (a)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		{
			System.out.println("This are Vowels");
		}
		break;
		default:
		{
			System.out.println("This is Consonents");
		}
			
		}
	}
}
