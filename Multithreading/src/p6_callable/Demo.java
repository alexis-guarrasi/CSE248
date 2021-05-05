package p6_callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo {

	public static void main(String[] args) {
		FactorialTask task1 = new FactorialTask(4);
		ExecutorService executor = Executors.newSingleThreadExecutor();
		Future<Integer> future = executor.submit(task1);
		executor.shutdown();
		try {
			Integer result = future.get().intValue();
			System.out.println("The result is: " + result);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}

}
