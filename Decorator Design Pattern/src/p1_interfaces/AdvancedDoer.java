package p1_interfaces;

public class AdvancedDoer implements DoerDecorator {
	private Doable doable;

	public AdvancedDoer(Doable doable) {
		this.doable = doable;
	}
	
	@Override
	public void setDoable(Doable doable) {
		this.doable = doable;
	}

	@Override
	public void doThis() {
		System.out.println("Do this another way.");
	}
	
	public void doThat() {
		System.out.println("Do that");
	}

}
