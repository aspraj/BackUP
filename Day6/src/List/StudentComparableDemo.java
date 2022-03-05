
/*      9         */

package List;

import java.util.TreeSet;

public class StudentComparableDemo {

	public static void main(String[] args) {
		

		TreeSet treeSet = new TreeSet();
		treeSet.add(new Student (11,"Akash",99.50));
		treeSet.add(new Student (12,"George",98.50));
		treeSet.add(new Student (10,"Bob",85.50));
		
		System.out.println(treeSet);
		
	}

}
