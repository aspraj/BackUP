package sharedata;

public class Client {

	public static void main(String[] args) {

		Display display = new Display();
		MyThread th1 = new MyThread(display, "Dhoni");
		MyThread th2 = new MyThread(display, "Kohli");
		System.out.println(th1.getState());
		th1.start();
		System.out.println(th1.getState());
		System.out.println(th2.getState());
		th2.start();
		System.out.println(th2.getState());
	}
}
