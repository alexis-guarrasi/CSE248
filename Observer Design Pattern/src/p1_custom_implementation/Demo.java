package p1_custom_implementation;

public class Demo {

	public static void main(String[] args) {
		Student observable = new Student("John Doe", 3.0);
		Observer observer1 = new StudentObserver("Dean's Office", observable);
		Observer observer2 = new StudentObserver("Registrar' Office", observable);
		
//		observable.setGpa(3.5);
//		observable.setName("Jane Doe");
		
		observable.unregister(observer1);
		observable.setGpa(4.0);
		
	}

}
