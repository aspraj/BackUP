package generics.day6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import List.day6.Employee;

public class GenericsDemo {

	public static void main(String[] args) {
		//Below type T is replaced by String reference type
       //Employee reference type
		
		Sender stringSender = new Sender();
		stringSender.setMessage(" Hello boi ");
		stringSender.sendMessage();
		 
		Sender empSender = new Sender();
		Employee emp = new Employee();
		emp.setEmpId(11);
		emp.setEmpName("Aman");
		empSender.setMessage(emp);
		empSender.sendMessage();
		
		List myIntegerList = new LinkedList();
		myIntegerList.add(new Integer(1));
		Integer intObjk = (Integer)myIntegerList.iterator().next();
		
		List<Integer> listOfInteger = new LinkedList<Integer>();
		listOfInteger.add(1);
		Integer intObj = listOfInteger.iterator().next();
		
		HashMap<String,Mammal> map = new HashMap<String,Mammal>();
		map.put("wombat",new Mammal("Wombat"));
		Mammal mammal = map.get("wombat");
		
		/**
		//
		Object object = new Integer(5);
		//
		Object[] objArr = new Integer[5];
		ArrayList<Object> arrayList = new ArrayList<Integer>();
		**/
		/**
		 * 
		 * There is no inheritance relationship between type arguments of a generic class is supported		 
		ArrayList<Integer> aL= new ArrayList<Integer>();
		ArrayList<Object> ao = aL;//If it is allowed at compile time,
		ao.add(new Object());
		Integer i=ao.get(0);// will result in runtime ClassCastException
		*/
		
		ArrayList<Integer> aL= new ArrayList<Integer>();
		List<Integer> li = new ArrayList<Integer>();
		Collection<Integer> ci = new ArrayList<Integer>();
		Collection<String> cs = new Vector<String> (4);
		
	}
}