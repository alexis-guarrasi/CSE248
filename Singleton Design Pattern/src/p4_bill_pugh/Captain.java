package p4_bill_pugh;

public class Captain {
	private static String name;
	
	private Captain() {
	}

	public static Captain getCaptain() {
		return SingletonHelper.captain;
	}
	
	public static void setName(String name) {
		Captain.name = name;
	}
	
	
	private static class SingletonHelper {
		private static final Captain captain = new Captain();
	}
}
