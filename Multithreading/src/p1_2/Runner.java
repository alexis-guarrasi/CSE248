package p1_2;

public class Runner implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i = 0; i < 5; i++) {
			System.out.println("Hello!\t" + Thread.currentThread().getId());
		}
	}

}
