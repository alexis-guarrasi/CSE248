package p0;

public class Demo {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			System.out.println("hello");
		}
		System.out.println("Done!");
		System.out.println(Thread.currentThread().getId());
	}

}
