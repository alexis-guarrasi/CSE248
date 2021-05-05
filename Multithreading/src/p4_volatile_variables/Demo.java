package p4_volatile_variables;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Processor p1 = new Processor();
		p1.start();
		
		System.out.println("Press ENTER to pause: ");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		p1.shutdown();
		
	}

}
