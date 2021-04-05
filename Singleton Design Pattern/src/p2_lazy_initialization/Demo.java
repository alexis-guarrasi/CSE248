package p2_lazy_initialization;

public class Demo {

	public static void main(String[] args) {
		Captain c1 = Captain.getCaptain("John Doe");
		System.out.println(c1);
//		
		Captain c2 = Captain.getCaptain("Jane Doe");
		System.out.println(c2);
		
		
		c2.setName("Jane Doe");
		System.out.println(c2);
		System.out.println(c1);
//		
		System.out.println(c1 == c2);
	}

}
