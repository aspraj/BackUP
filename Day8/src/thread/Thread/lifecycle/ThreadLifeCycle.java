package thread.Thread.lifecycle;

public class ThreadLifeCycle {

	public static void main(String[] args) {
		Thread mythread = new MyThread();
		System.out.println("Before Runnable stage Thread is alive or not");
		System.out.println(mythread.isAlive());
		mythread.start();
		
		try {
			mythread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Thread is interrupted");
		}
		System.out.println(mythread.isAlive());

	}

}
