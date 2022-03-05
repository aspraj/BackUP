package day14.enumexample;

import java.util.Scanner;

public class PriorityMain {

	public static void main (String args[])
	{
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		Priority priority = Priority.valueOf(input);
		switch(input)
		{
		case "LOW":
			System.out.println("Priority is low");
			break;
		case "MEDIUM":
			System.out.println("Priority is MEDIUM");
			break;
		case "HIGH":
			System.out.println("Priority is HIGH");
			break;
		case "CRITICAL":
			System.out.println("Priority is CRITICAL");
			break;
		default:
			System.out.println("No matches found");
		}
	}
}
