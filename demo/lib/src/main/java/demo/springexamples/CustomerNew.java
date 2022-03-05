package demo.springexamples;


public class CustomerNew implements IAddressInjector {
	IAddress address;
	@Override
	public void injectAddress(IAddress address) {
		this.address=address;
	}

}