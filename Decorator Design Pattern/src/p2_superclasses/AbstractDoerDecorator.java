package p2_superclasses;

public abstract class AbstractDoerDecorator extends AbstractDoer{
	
	@Override
	public void doThis() {
		super.doThis();
		System.out.println("Do this in a different way.");
	}
}
