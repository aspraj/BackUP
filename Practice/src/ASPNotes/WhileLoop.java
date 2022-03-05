package ASPNotes;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		int i = 0;
		System.out.println(" Enter a no to see the ginti");
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		int a = obj.nextInt();
				do{
					System.out.println(i);
					i = ++i;
				}while(a>i);
		System.out.println(i);

	}

}
