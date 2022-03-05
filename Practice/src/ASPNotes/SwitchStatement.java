/**
 * 
 */
package ASPNotes;

import java.util.Scanner;

/**
 * @author RAJPUT JI
 *
 */
public class SwitchStatement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a ;
		Scanner obj = new Scanner(System.in);
		a = obj.nextInt();
		switch(a)
		{
		case 1:
			System.out.println(" this is the case 1");
			break;
		case  2:
			System.out.println(" this is the case 2");
			break;
		default :
			System.out.println(" this is not matching with anyone");
		}

	}

}
