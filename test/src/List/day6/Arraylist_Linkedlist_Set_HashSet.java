/*             1              */

package List.day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Arraylist_Linkedlist_Set_HashSet {

	public static void main(String[] args) {
		// List can store the ordered collection of objects. It can have duplicate
		// values.
		// List interface is implemented by the classes ArrayList,LinkedList,Vector and
		// Stack
		List arrayList = new ArrayList();

		List vectorList = new Vector();

//		ArrayList class implements the List interface. It uses a dynamic array to store the duplicate element of different data types.
//		It maintains insertion order and is non-synchronized.

//		adding elements in list
		arrayList.add(11);
		arrayList.add("Hello");
		arrayList.add(54.55);
		arrayList.add("Everyone");

//		printing elements we can do it with for each also
		Iterator itr = arrayList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("**********************************");

//		printing elements
		arrayList.forEach(System.out::println);
		System.out.println("**********************************");

		System.out.println(arrayList.isEmpty()); // arraylist is empty or not
		System.out.println(arrayList.contains("Hello")); // hello is present in the arraylist or not
		System.out.println("**********************************");

		System.out.println(arrayList.get(3));// printing 3rd element of list
		System.out.println(arrayList.get(2));// printing 2nd element of list
		System.out.println(arrayList.size());// No. of elements in list
		System.out.println(arrayList.remove(0));// It will remove 0th element
		System.out.println(arrayList);
		System.out.println("**********************************");

		arrayList.add("Hello");
		System.out.println(arrayList);
//		We are decoupling our code from a specific implementation of the interface
//		 This is called programming to interface. It will be helpful in case 
//		if you wish to move to some other implementations of List in the future.
		List<String> strList = new ArrayList<String>();
		strList.add("Hi");
		strList.add("Good");
		strList.add("Morning");
		// ArrayList<String> listOfString = new ArrayList<String>();
		strList.add(null);
		strList.add("Ayush");

		System.out.println(strList);
		System.out.println("**********************************");

//		EMPLOYEE BANAYA FIR USKO LIST M ADD KIYA 
		Employee e = new Employee();
		e.setEmpId(11);
		e.setEmpName("Ayush");

		Employee e1 = new Employee();
		e1.setEmpId(15);
		e1.setEmpName("Jyotika");
//		LIST BANAI
		List<Employee> listOfEmployee = new ArrayList<Employee>();
//		ADD KIYA
		listOfEmployee.add(e1);
		listOfEmployee.add(e);
//		PRINT KARA LIYA
		System.out.println(listOfEmployee);
//		PRINT KARA LIYA		
		for (Employee emp : listOfEmployee) {
			System.out.println(emp);
		}

		Iterator iter = listOfEmployee.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("**********************************");

		// LinkedList implements Collection interface.It used doubley linked list to
		// store the elements.
		// It can store the duplicate elements.
		// It maintains insertion order and is non-synchronized.
		// The manipulation is fast because no shifting is required

		List<String> linkedList = new LinkedList<String>();
//		ADD KARWA DIYE
		linkedList.add("Ragini");
		linkedList.add("Rakesh");
		linkedList.add("Rajesh");
		linkedList.add("Mahesh");
		linkedList.add("Asaf");
		linkedList.add("Ragini");

//		PRINT KARWAYA
		Iterator iterator = linkedList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println(linkedList);
		System.out.println("**********************************");

//		THIS REPACED THE ELEMENT 1
		linkedList.set(1, "Ayushi"); // replacing the element at particular index position
		System.out.println(linkedList);

//		SABHI KO REPLACE KARDIA
		Collections.replaceAll(linkedList, "Ragini", "Shyam");
		System.out.println(linkedList);
		
		linkedList.replaceAll(String::toLowerCase); // method reference or you can use lambda expression
		System.out.println(linkedList);
		System.out.println("**********************************");

		// Vector uses a dynamic array to store the data elements. It is similar to
		// ArrayList.
		// It is synchronized and contains many methods that are not part of Collection
		// framework
		
		List<Integer> vectr = new Vector<Integer>();
		vectr.add(14);
		vectr.add(11);
		vectr.add(10);
		vectr.add(12);
		vectr.add(13);

		for (Integer intNum : vectr) {
			System.out.println(intNum);
		}

		// Stack- is subclass of Vector. It implements LIFO data structure i.e. Stack.
		// It contains methods of Vector class and also provides like boolean
		// push(),peek() etc which defines its properties.
		List stack = new Stack();// LIFO
		Stack<Double> stackOfDoubleNum = new Stack<Double>();
		stackOfDoubleNum.push(15.50);
		stackOfDoubleNum.push(14.5);
		stackOfDoubleNum.push(11.11);
		stackOfDoubleNum.push(10.25);
		System.out.println("**********************************");
		for (Double num : stackOfDoubleNum) {
			System.out.println(num);
		}
		System.out.println("**********************************");
		System.out.println(stackOfDoubleNum);
		stackOfDoubleNum.pop();
		System.out.println(stackOfDoubleNum);

//		Double[] arrDoubleNume = {55.43,46.78,99.99};
//		Stack stackOfDBNum= new Stack();
//		stackOfDBNum.push(arrDoubleNume);
//		stackOfDBNum.push("Vector is interesting");
//		stackOfDBNum.push(1555);
//		System.out.println(stackOfDBNum);
		System.out.println("*****************");
//		
//		for(int i=0;i<((Double[]) stackOfDBNum.get(0)).length;i++) {
//			System.out.println(((Double[]) stackOfDBNum.get(0))[i]);
//		}
//		System.out.println("*****************");

//		//System.out.println(stackOfDBNum.get(0));
//		Double[] aDNum = (Double[]) stackOfDBNum.get(0);
//		for(int i=0;i<aDNum.length;i++) {
//			System.out.println(aDNum[i]);
//		}

	}

}