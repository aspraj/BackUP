package ASPNotes;

import java.util.Scanner;

public class FactorialOfNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		int a = obj.nextInt();
		for (int i=1,b=1; a>i;--a)
		{
			b=b*a;
			System.out.println(b);
		}	
		
	}

}
