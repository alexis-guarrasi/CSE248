package p4_volatile_variables;

public class Processor extends Thread {
	private volatile boolean flag = true;
	
	public void run() {
		
		while(flag) {
			System.out.println("Hi");
//			System.out.println(Thread.currentThread().getName());
		}
	}
	
	public void shutdown() {
		flag = false;
	}

}
