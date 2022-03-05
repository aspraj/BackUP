package executor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyThread {

	public static void main(String[] args) {

		Runnable task=()->System.out.println("Hello World");
		Thread thread = new Thread(task);
		thread.start();
		
		Executor executor = Executors.newSingleThreadExecutor();
		Runnable task2 = ()->System.out.println("I run");
		executor.execute(task2);
		
		ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
		ExecutorService fixedThreadExecutor = Executors.newFixedThreadPool(8);
		
		Runnable task3 = ()->System.out.println("Some really long process");
		singleThreadExecutor.execute(task3);
		
		Runnable task4 = ()->System.out.println("Another really long process");
		fixedThreadExecutor.execute(task4);
		
		Runnable task5 = ()->System.out.println("Another  really long process");
		singleThreadExecutor.execute(task5);

		ExecutorService exec = Executors.newFixedThreadPool(10);
		List<Future<String>> list = new ArrayList<Future<String>>();
		Callable<String> callable = new MyCallable();
		for(int i=0; i<100; i++)
		{
			Future<String> future = exec.submit(callable);
			list.add(future);
			
		}
		for(Future<String> fut:list)
		{
			try {
				System.out.println(new Date()+ "::"+fut.get());
				
			}
			catch (InterruptedException| ExecutionException e)
			{
				e.printStackTrace();
			}
			
			exec.shutdown();
		}
	}

}
