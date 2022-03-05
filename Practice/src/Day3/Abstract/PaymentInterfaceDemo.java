
/*           8              */


package Day3.Abstract;

public class PaymentInterfaceDemo {

	public static void main(String[] args) {
		UPIPayment upiPayment = new UPIPayment();
		upiPayment.displayPaymentInformation();
		upiPayment.recievePayment();
	}

}