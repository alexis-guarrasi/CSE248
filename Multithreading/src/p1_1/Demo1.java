package p1_1;

public class Demo1 {

	public static void main(String[] args) {
		Runner r1 = new Runner();
		Runner r2 = new Runner();
		
		r1.start();
		r2.start();
//		
//		try {
//			r1.join();
//			r2.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		System.out.println(Thread.currentThread().getPriority());
		System.out.println("Done!");
		System.out.println("Main Thread Name: " + Thread.currentThread().getName());
	}

}
