package p1_1;

public class Runner extends Thread {
	
	@Override
	public void run() {
//		Thread.currentThread().setPriority(MAX_PRIORITY);
		System.out.println("New Thread Name: " + Thread.currentThread().getName());
		for(int i = 0; i < 5; i++) {
			System.out.println("hello \t" + Thread.currentThread().getId());
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
