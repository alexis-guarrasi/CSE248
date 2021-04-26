package p2_superclasses;

public class AdvancedDoer extends AbstractDoerDecorator{
	private AbstractDoer doer;
	
	public AdvancedDoer() {}
	
	public AdvancedDoer(AbstractDoer doer)  {
		this.doer = doer;
	}
	
	public void doThat() {
		System.out.println("Do that!");
	}
		
}
