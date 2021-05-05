package p6_callable2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class App {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newSingleThreadExecutor();
		Future future = executor.submit(new GPACurveCalculator(2.0, 0.5));
		System.out.println("New task submitted.");
		executor.shutdown();
		
		try {
			double newGpa = (double) future.get(2, TimeUnit.SECONDS); // get() will stop execution until result comes back
			System.out.println("The curved GPA is: " + newGpa);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName());
		System.out.println("Done with the main thread.");
	}

}
