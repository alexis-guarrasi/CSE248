package p5_thread_pools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Demo {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(10);
		
		for(int i = 0; i < 5; i++) {
			executor.submit(new Processor(i));
		}
		
		executor.shutdown();
		
		try {
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("All tasks are complete.");
	}

}
