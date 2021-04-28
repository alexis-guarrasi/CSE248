package p1_2;

public class Demo {

	public static void main(String[] args) {
		Runner r1 = new Runner();
		Thread t1 = new Thread(r1);
		
		Thread t2 = new Thread(new Runner());
		
		t1.setPriority(10);
		t2.setPriority(1);
		
		t1.start();
		t2.start();
		
		System.out.println("Done!");
	}

}
