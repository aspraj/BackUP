package executor;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		return "Hello i am from call methos of my callable";
 	}

	
}
