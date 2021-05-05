package p8_wait_notify;

import java.util.Scanner;

public class App {
	static App app = new App();
	public static void main(String[] args) {
//		Object lock = new Object();
		
		Thread t1 = new Thread(() -> {
			synchronized(app) {
				System.out.println("t1 got the lock. Producer thread running...");
				try {
//					lock.wait();
					app.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("t1 regained the lock.");
			}
		});
		
		Thread t2 = new Thread(() -> {
			Scanner scanner = new Scanner(System.in);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized(app) {
				System.out.println("t2 gained the lock.");
				System.out.println("Waiting for return key.");
				scanner.nextLine();
				System.out.println("Return key pressed.");
				app.notify();
				System.out.println("t2 losed the lock.");
			}
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

}
