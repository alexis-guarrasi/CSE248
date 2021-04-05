package p3_eager_initialization;

public class Captain {
	private static String name;
	private static Captain captain = new Captain();
	
	private Captain() {
	}
	
	public static Captain getCaptain(String name) {
		Captain.setName(name);
		return captain;
	}

	public String getName() {
		return name;
	}

	public static void setName(String name) {
		Captain.name = name;
	}
	
	
	
}
