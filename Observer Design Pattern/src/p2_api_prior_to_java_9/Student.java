package p2_api_prior_to_java_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Student extends Observable {
	private String name;
	private double gpa;
	
	public Student(String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
		setChanged();
		notifyObservers("GPA changed!");
	}
	
}
