package p1_static_variables;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("A", 1);
		Student s2 = new Student("B", 2);
		
		System.out.println(s1.getIdCounter());
		System.out.println(s2.getIdCounter());
		
		System.out.println(Student.getIdCounter());
		
		
	}

}
