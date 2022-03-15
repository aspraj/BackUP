package ConcurrentHashMap.day9;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {

		ConcurrentHashMap<String,Integer> evenNumbers = new ConcurrentHashMap<String,Integer>();
		evenNumbers.put("Two", 2);		
		evenNumbers.put("Four",4);		
		System.out.println(evenNumbers);

		System.out.println("***************************************");
		ConcurrentHashMap<String,Integer> nums = new ConcurrentHashMap<String,Integer>();
		nums.put("Three",3);		
		System.out.println(nums);

		nums.putIfAbsent("six", 6);		
		nums.putIfAbsent("Four", 4);		
		System.out.println(nums);


		System.out.println("***************************************");
		ConcurrentHashMap<String,Integer> num = new ConcurrentHashMap<String,Integer>();
		num.put("One", 1);
		System.out.println(num);
		num.putAll(nums);
		System.out.println(num);
		System.out.println("***************************************");
		
		System.out.println(num.values());
		System.out.println(num.values() instanceof Collection);
		System.out.println(num.keys());

		System.out.println("***************************************");
		System.out.println(num.keySet() instanceof Set);
		System.out.println(num.size());
		System.out.println(num.entrySet());
//		Map<String,Integer> num1 = new HashMap <String,Integer>();
//		num1.put("One", 1);

		System.out.println("***************************************");
		Set keySet = num.keySet();
		keySet.forEach(System.out::println);
		Set<String>  setk = num.keySet().stream().collect(Collectors.toSet());
		setk.add("Seven");
		System.out.println(setk);
		
		num.forEach(4,(k,v)->System.out.println("key :- "+k +" "+"value:- "+v));
		
		String key = num.search(4, (k,v)->{return v==6?k:null;});
		System.out.println("Searched value: "+key);	
	}
}