package thread.Thread.lifecycle;

public class ThreadADemo {
	
	public static Thread tB;   // int a
	public static ThreadB obj;
	
	public static void main(String[] args) {
		ThreadB obj = new ThreadB();
		Thread tB= new Thread(obj);
		
		//tB is spwaned
		System.out.println("The state of thread tB after spawing it :---"+tB.getState());
		
		//tB is started()
		tB.start();
		//tB is moved to the runnable state
		System.out.println("The state of thread tB after invoiking the method start() on it :---"+tB.getState());

	}

}