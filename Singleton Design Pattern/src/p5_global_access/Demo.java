package p5_global_access;

public class Demo {

	public static void main(String[] args) {
		StudentStore ss1 = StudentStore.getStudentStore(100);
		ss1.insert(new Student("A", 1));
		ss1.insert(new Student("B", 2));
		ss1.display();
		System.out.println("--------------------");
		StudentStore ss2 = StudentStore.getStudentStore(50);
		ss2.insert(new Student("C", 3));
		ss2.display();
		
	}

}
