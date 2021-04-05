package p5_global_access;

public class StudentStore {
	private Student[] arr;
	private int nElems;
	private static StudentStore studentStore;
	
	private StudentStore(int maxSize) {
		arr = new Student[maxSize];
	}
	
	public static StudentStore getStudentStore(int maxSize) {
		if(studentStore == null) {
			studentStore = new StudentStore(maxSize);
			return studentStore;
		} else {
			return studentStore;
		}
	}
	
	public void insert(Student s) {
		arr[nElems++] = s;
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}
	
}
