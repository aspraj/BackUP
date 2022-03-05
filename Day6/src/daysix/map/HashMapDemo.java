package daysix.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo {

	//TreeMap will give you a sorted output
		public static void main(String[] args)
		{
			
			HashMap tm = new HashMap();
			tm.put("Jhonny dip", 5515.25);
			tm.put("Tom holland", 123.22);
			tm.put("Todumal", 1378.00);
			tm.put("Action jackson", 99.22);
//			tm.put(null, 18.24);
			tm.put("Rajesh khanna", null);
//			tm.put(null, 16.5);
			tm.put("Prabhat pandey", 99.22);
			tm.put("supdewali", 98.22);
			System.out.println(tm);
			
			Set set = tm.entrySet();
			System.out.println(set);
			System.out.println(tm.keySet());
			System.out.println(tm.get("Todumal"));
			
			Iterator itr = set.iterator();
			while(itr.hasNext())
			{
				Map.Entry<String, Double> me = (Map.Entry<String, Double>)itr.next();
				System.out.println(me.getKey()+":"+me.getValue());
			}
			
			
			System.out.println(tm.keySet());
			System.out.println(tm.values());
			
		}
}