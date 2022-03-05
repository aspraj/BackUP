
/*                       2                  */

package corejavaexample.main.inheritance;
// Derived class or subclass or child class
// Derived class is inheriting the Base using the extends keyword
public class Derived extends Base {
	
	public void derivedMethod() {
		
		// Called basemethod from base class with the help of super 
		super.baseMethod();
		System.out.println("Derived");
	}
}