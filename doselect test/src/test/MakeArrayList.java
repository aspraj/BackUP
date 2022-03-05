package test;

import java.util.*;
import java.util.stream.Collectors;

class ArrayListOps {
	
	 public List<Integer> makeArrayListInt(int n) {
		 List<Integer> list1 = new ArrayList<Integer>();
		 for (int i=0; i<n; --n)
		 {
			 list1.add(i);
			 
		 }
		 System.out.println( list1 );
		return list1;
		}
		
		
		public ArrayList<Integer>	reverseList(ArrayList<Integer>list) {
			
				Collections.reverse(list);
				System.out.println(list);
				return list;
				
		}

		public ArrayList<Integer> changeList(ArrayList<Integer> list2, int i, int j) {
			
				int l=list2.indexOf(i);
					list2.set(l, j);
			System.out.println( list2 );
			return list2;

	}
}
	   
	 public class MakeArrayList{
		 
public static void main(String args[])
{

	int arra[] = new int [10];
	Scanner obj =new Scanner(System.in);
	int n = obj.nextInt();
	
	ArrayListOps arr = new ArrayListOps();
	arr.makeArrayListInt(n);
	
	ArrayList<Integer> list1 = new ArrayList<Integer>();
		 for (int i=0; i<4; i++)
		 {
			 arra[i]=obj.nextInt();
			 list1.add(arra[i]);
			 
		 }
		 arr.reverseList(list1);
		
		 ArrayList<Integer> list2 = new ArrayList<Integer>();
		 for (int i=0; i<4; i++)
		 {
			 arra[i]=obj.nextInt();
			 list2.add(arra[i]);

		 }
		 System.out.println( list2 );
		 int b = obj.nextInt();
		 int c = obj.nextInt();
		 
		 
	 arr.changeList(list2,b,c);
	}
}