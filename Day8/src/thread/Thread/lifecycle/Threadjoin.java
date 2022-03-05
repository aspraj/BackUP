package thread.Thread.lifecycle;

public class Threadjoin {

	public static void main(String[] args) {
		
		Thread th1 = new Thread(new MyRunnable(),"First");
		Thread th2 = new Thread(new MyRunnable(),"Second");
		Thread th3 = new Thread(new MyRunnable(),"Third");
		
		th1.start();
		
		try {
			th1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		th2.start();
		
		try {
			th2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		th3.start();
		
		try {
			th1.join();
			th2.join();			
			th3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		System.out.println("All threads are dead, existing main thread ");


	
	}

}
