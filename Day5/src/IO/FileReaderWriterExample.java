package IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterExample {
	
	public static void main(String args[])
	{
		try {
			
			FileWriter fw = new FileWriter("F:\\writer.txt");
			fw.write("Hello why are you here");
			fw.close();
			
//			FileWriter fwn = new FileWriter("F:\\writer.txt",true);
//			fwn.write(" new line added");
//			fwn.close();
			
			FileReader fr = new FileReader("F:\\writer.txt");
			int i=0;
			while((i=fr.read())!=-1)
			{
				System.out.println((char)i);
			}
			
			fr.close();
		}
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
