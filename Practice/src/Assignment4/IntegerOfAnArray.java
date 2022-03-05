package Assignment4;

import java.util.Scanner;

public class IntegerOfAnArray {

	public static void main(String args[]) {
	
	System.out.println("Enter the array element");
	
	int arr[] = new int [5];
	
	Scanner obj = new Scanner(System.in);
	
	for (int i=0; i<=4; i++)
	{
		arr[i]=obj.nextInt();
	}
	System.out.println("Enter the any element to see it is present in array or not");
	int c= obj.nextInt();
	
	for (int i=0; i<arr.length;i++)
	{	boolean asp = arr[i]==c;
	if (c==arr[i])
	{
		System.out.println("The no entered by the user is present at "+arr[i-1]+" position");
		break;
	}
	}
	
	
	
	}
}
