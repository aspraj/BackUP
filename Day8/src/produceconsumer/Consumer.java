package produceconsumer;

public class Consumer extends Thread{

	private Factory factory;
	public Consumer(Factory factory) {
		this.factory =  factory;
	}
		
	public void run() {
		factory.get();
	}
}
