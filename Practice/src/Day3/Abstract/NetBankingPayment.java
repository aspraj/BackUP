
/*           3.5              */

package Day3.Abstract;

public class NetBankingPayment extends Payment implements PaymentInfo{

	@Override
	public void recievePayment() {
		System.out.println("Recieve payment using net banking");

	}

	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub

	}

}