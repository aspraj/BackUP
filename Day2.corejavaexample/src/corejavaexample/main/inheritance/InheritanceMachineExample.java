
/*                   7                     */

package corejavaexample.main.inheritance;

public class InheritanceMachineExample {

	public static void main(String[] args) {
		Printer printer = new Printer();
		//Reusability of code
		printer.powerAdapter();
		
		//concrete behavior of Printer class
		printer.printMessage();
		
		Scanner scanner = new Scanner();
		scanner.powerAdapter();
		scanner.scanDocs();
		

	}

}