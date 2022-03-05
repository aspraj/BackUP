package ThreadEx;

public class HelloThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadExample th = new ThreadExample();
		th.start();
		
		System.out.println(th.getId());
		System.out.println(th.getName());
		System.out.println(th.getThreadGroup());
		System.out.println(th.getState());
		
		System.out.println(th.getPriority());
	}

}
