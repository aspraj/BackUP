
/*                       11                          */

package corejavaexample.main.inheritance;

public class RestaurantPayment
{
	public static void main(String args[])
	{
		TelephonicOrder order = new TelephonicOrder();
		order.getPaymentByCard();
		
		WalkInCustomer order1 = new WalkInCustomer ();
		order1.getPaymentByCash();
	}
}
