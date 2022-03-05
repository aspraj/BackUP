package ThreadEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SleepDemo {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list = Arrays.asList("Winter","Summer","Rainy","Autumn");
		
		for (String value:list)
		{
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
//			System.out.println("Thread is alive or dead" + this.isAlive());
			e.printStackTrace();
		}
		System.out.println(value);
		}
	}

}
