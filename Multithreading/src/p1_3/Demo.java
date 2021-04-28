package p1_3;

public class Demo {

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			for(int i = 0; i < 5; i++) {
				System.out.println("hello\t" + Thread.currentThread().getId());
			}
		});
		
		Thread t2 = new Thread(() -> {
			for(int i = 0; i < 5; i++) {
				System.out.println("hi\t" + Thread.currentThread().getId());
			}
		});
		
		t1.start();
		t2.start();
		
		System.out.println("Done!");
		
	}

}
