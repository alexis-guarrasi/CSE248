package p2_lazy_initialization;

public class Captain {

	private String name;
	private static Captain captain;

	private Captain(String name) {
		this.name = name;
	}
	
	public static Captain getCaptain(String name) {
		if(captain == null) {
			captain = new Captain(name);
			return captain;
		} else {
			return captain;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Captain [name=" + name + "]";
	}

}
