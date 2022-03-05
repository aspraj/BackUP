package Hashtable;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {

		Hashtable ht = new Hashtable();
		Enumeration name;
		String str;
		double bal;
		
		ht.put("Aman",452.2);
		ht.put("Raman",42.2);
		ht.put("Ram",45.2);
		ht.put("man",52.2);
		System.out.println(ht);

		name = ht.keys();
		while(name.hasMoreElements())
		{
			str =(String)name.nextElement();
			System.out.println(str +" "+ht.get(str));
		}
		
		bal =(double) ht.get("Ram");
		ht.put("Ram",bal+1000);
		System.out.println(ht.get("Ram"));
	}
}