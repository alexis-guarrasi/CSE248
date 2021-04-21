package p2_api_prior_to_java_9;

public class Demo {

	public static void main(String[] args) {
		Student observable = new Student("John Doe", 3.5);
		StudentObserver o1 = new StudentObserver("Dean's Office", observable);
		StudentObserver o2 = new StudentObserver("Registrar's Office", observable);
		observable.setGpa(4.0);
		
		observable.deleteObserver(o2);
		
		observable.setGpa(1.0);
	}

}
