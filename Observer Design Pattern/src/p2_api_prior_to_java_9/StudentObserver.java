package p2_api_prior_to_java_9;

import java.util.Observable;
import java.util.Observer;

public class StudentObserver implements Observer {
	private String name;
	
	public StudentObserver(String name, Observable student) {
		student.addObserver(this);
		this.name = name;
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("The student observed is " + ((Student)o).getName()
				+ ", " + ((Student)o).getGpa());
		System.out.println(arg);
	}
	
}
