package IO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {

	public static void main(String[] args) {
		
	String filepath = "F:\\writer.txt";
	String  data = "Will take a break after this example";
	int position = 5;
	int size = 10;
	
	WriteToAFile (filepath, position, data);
	ReadFromAFile(filepath, position, size );
		
	}
	
	

	private static void ReadFromAFile(String filepath, int position, int size )
	{
		try {
			
			RandomAccessFile raf = new RandomAccessFile(filepath,"r");
			raf.seek(8);
			byte[] bytes =new byte[size];
			raf.read(bytes);
			System.out.println(new String(bytes));
			raf.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static void 	WriteToAFile(String filepath, int position, String data )
	{
		try {
			
			RandomAccessFile raf = new RandomAccessFile(filepath,"rw");
			raf.seek(position);
			raf.write(data.getBytes());
			raf.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
