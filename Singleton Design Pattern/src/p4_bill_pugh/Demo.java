package p4_bill_pugh;

public class Demo {

	public static void main(String[] args) {
		Captain c1 = Captain.getCaptain();
		Captain.setName("John Doe");
		
		Captain c2 = Captain.getCaptain();
		c2.setName("Jane Doe");
		
		System.out.println(c1 == c2);
	}

}
