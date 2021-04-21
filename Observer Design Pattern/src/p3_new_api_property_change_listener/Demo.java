package p3_new_api_property_change_listener;

public class Demo {

	public static void main(String[] args) {
		Student student = new Student(); // observable
		Record record1 = new Record("John Doe", 1.0); // record

		StudentListener listener1 = new StudentListener();
		student.addPropertyChangeListener(listener1);

		StudentListener listener2 = new StudentListener();
		student.addPropertyChangeListener(listener2);

		student.setRecord(record1);

		System.out.println(listener1.getRecord());
		System.out.println(listener2.getRecord());

		Record record2 = new Record("Jane Doe", 3.0); // record
		student.setRecord(record2);

		System.out.println(listener1.getRecord());
		System.out.println(listener2.getRecord());

	}

}
