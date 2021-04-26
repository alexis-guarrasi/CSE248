package p2_superclasses;

public class Demo {

	public static void main(String[] args) {
		Doer doer1 = new Doer();
		doer1.doThis();
		
		AdvancedDoer doer2 = new AdvancedDoer(doer1);
		doer2.doThis();
		doer2.doThat();
	}

}
