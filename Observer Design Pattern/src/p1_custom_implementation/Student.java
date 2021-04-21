package p1_custom_implementation;

import java.util.ArrayList;
import java.util.List;

public class Student implements Observable {
	private String name;
	private double gpa;
	private List<Observer> observerList;
	
	public Student(String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
		observerList = new ArrayList<>();
	}

	@Override
	public void register(Observer observer) {
		observerList.add(observer);
	}

	@Override
	public void unregister(Observer observer) {
		int index = observerList.indexOf(observer);
		observerList.remove(index);
		System.out.println("Observer " + (index + 1) + " is removed.");
	}

	@Override
	public void notifyObservers() {
		for(Observer observer : observerList) {
			observer.update(name, gpa);
		}
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
		notifyObservers();
	}
	
	
	
	
}
