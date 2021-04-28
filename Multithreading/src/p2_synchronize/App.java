package p2_synchronize;

public class App {
	private int count;
	
	public static void main(String[] args) {
		App app = new App();
		app.doWork();
	}
	
	public synchronized void increment() {
		count++;
	}
	
	public void doWork() {
		Thread t1 = new Thread(() ->  {
			for(int i = 0; i < 1000; i++) {
				increment();
			}
		});
		
		Thread t2 = new Thread(() ->  {
			for(int i = 0; i < 1000; i++) {
				increment();
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
		
		System.out.println("The total is " + count);
	
	}

}
