package assignment3;

import java.util.Scanner;

public class IntegerSearch {

	public static void main(String args[]) {
	
	int arr[] = {1,2,3,4,5,6};
	
	Scanner obj = new Scanner(System.in);
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
