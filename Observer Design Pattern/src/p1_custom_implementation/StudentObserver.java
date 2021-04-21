package p1_custom_implementation;

public class StudentObserver implements Observer {
	private String name;

	
	public StudentObserver(String name, Student student) {
		this.name = name;
		student.register(this);
		System.out.println("Added a new observer: " + name + ".");
	}
	
	@Override
	public void update(String name, double gpa) {
		System.out.println("The student observed is: " + name + "," + gpa + ".");
	}
	
}
