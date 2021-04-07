package p1_ducks;

public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("The Canadian duck does not fly...");
	}

}
