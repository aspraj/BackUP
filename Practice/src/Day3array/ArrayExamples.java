package Day3array;

public class ArrayExamples {

	int arr[];

	public ArrayExamples(int i) {
	arr=new int [i];
	}
	
	void populateArray()
	{
		for (int i=0; i<arr.length; i++)
		{
			arr[i]=i;
		}
	}
	void displayContents() {
		for (int i=0; i<arr.length; i++) {
			System.out.println("number"+i+":"+arr[i]);
		}
	}
	public static void main(String args[])
	{
		System.out.println(args[0] +"--"+args[1]+"--"+args[2]);
		int intArg = Integer.parseInt(args[0]);
		ArrayExample arrayexample = new ArrayExample(intArg);
		System.out.println();
		arrayexample.displayContents();
		
		
		
	}
	

}
