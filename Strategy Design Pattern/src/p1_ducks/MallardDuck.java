package p1_ducks;

public class MallardDuck extends Duck {
	
	public MallardDuck(FlyBehavior fb, QuackBehavior qb) {
		setFlyBehavior(fb);
		setQuackBehavior(qb);
	}
	
	public MallardDuck() {}

	@Override
	public void display() {
		System.out.println("Displaying a mallard duck...");
	}

}
