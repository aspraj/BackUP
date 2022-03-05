package IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendInAFileExample {

	public static void main(String[] args) {
	
		try {
		String data =" It's Interesting to learn IO";
		File file = new File("F:\\writer.txt");
		
		if (file.exists())
		{
			System.out.println("File present in the folder");
		}
		else
		{
				file.createNewFile();
		}
		
		FileWriter fw = new FileWriter(file,true);
		BufferedWriter br = new BufferedWriter(fw);
		br.write(data);
		br.close();
		
		
		
//		FileWriter fw = new FileWriter("F:\\writer.txt",true); //it can also add the new line to existing line
		
		}
		catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

}