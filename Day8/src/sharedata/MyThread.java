package sharedata;

public class MyThread extends Thread{

	private Display display ;
	private String name;
	
	public MyThread(Display display, String name) {
		super();
		this.display = display;
		this.name = name;
	}
	
	public void run () {
		display.wish(name);
	}
	
	
	
	
}