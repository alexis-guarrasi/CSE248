package p1_interfaces;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo {

	public static void main(String[] args) {
		Doer doer = new Doer();
		doer.doThis();
//		
		AdvancedDoer advancedDoer = new AdvancedDoer(doer);// wrapper class
		advancedDoer.doThis();
		advancedDoer.doThat();
		
//		try {
//			FileOutputStream fos = new FileOutputStream("data.dat");
//			ObjectOutputStream oos = new ObjectOutputStream(fos);
//			oos.writeObject(doer);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}

}
