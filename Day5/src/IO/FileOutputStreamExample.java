package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
	
	public static void main(String args[])
	{
		//InputStream and OutputStream api and classes to perform input output 
		//InputStream to read data from the source
		//OutputStream heirarcy 1. File ops 2. Byte ArrayOs 3. Filter Ops 4. Piped Output Stream 5.Object Ops
		//Filter OPS 1. DataOps  cntrl +shift+t 2.BufferOPS 3. PrintStream
		//Input sream class 1. file ips 2. Byte Arrays IPS 3.FilterIps 4.Piped IPS(Iputstream cntr+shift+t)
		//FilterIPS 1.DataIPS 2.BufferIPS 3.Push backIPS
		//to write something oin a particular  file
		
			// we dont have the c permissions
			// it automatically create in another blocks

				try {
					
					String word ="Good Morning";
					FileOutputStream fout = new FileOutputStream("F:\\hello.java");
					fout.write(68);
					
					fout.write(65);   //to write the unicode value of 65 is A
					byte bArr[] =word.getBytes();
//				fout.write(null);
					fout.write(bArr);   //to write the unicode value of 65 is A
					fout.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		
		
		
}
