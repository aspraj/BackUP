package ASPNotes;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner (System.in);
		int a = obj.nextInt();
		for (int i =1,b;i<=10;i++)
		{
			b=a*i;
			System.out.println(b);
		}
	}

}
