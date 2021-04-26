package p1;

public class Runner extends Thread {
	
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("hello " + i);
		}
	}

}
