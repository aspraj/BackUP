package ThreadEx;

public class HelloRunnableDemo {

	public static void main(String[] args) {
		HelloRunnable hr = new HelloRunnable();
		
		
		Thread th = new Thread(hr);
		th.start();
	}

}
