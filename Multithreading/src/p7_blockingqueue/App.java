package p7_blockingqueue;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class App {
//	private static BlockingQueue<Integer> queue1 = new ArrayBlockingQueue<>(10);
	private static BlockingQueue<Integer> queue1 = new LinkedBlockingQueue<>();

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			produce();
		});
		
		Thread t2 = new Thread(() -> {
			consume();
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	private static void produce() {
		Random random = new Random();
		
		while(true) {
			try {
//				Thread.sleep(2);
				queue1.put(random.nextInt(100));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	private static void consume() {
		while(true) {
			try {
//				Thread.sleep(1);
				Integer value = queue1.take();
				System.out.println("Taken value " + value + "; queue1 size " + queue1.size());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
