package p1_ducks;

public class DuckDemo {

	public static void main(String[] args) {
//		Duck md1 = new MallardDuck();
//		md1.setFlyBehavior(new FlyWithWings());
//		md1.setQuackBehavior(new Squeak());
//		
//		md1.performFly();
//		md1.performQuack();
//		md1.display();
//		
//		md1.setFlyBehavior(new FlyWithLegs());
//		md1.performFly();
//		System.out.println("-------------------------");
//		Duck rd1 = new ReadheadDuck();
//		rd1.setQuackBehavior(new Quack());
//		rd1.setFlyBehavior(new FlyWithLegs());
//		rd1.performFly();
//		rd1.performQuack();
//		
//		System.out.println("-------------------------");
//		Duck cd1 = new CanadianDuck();
//		cd1.setQuackBehavior(new Quack());
//		cd1.setFlyBehavior(new FlyNoWay());
//		cd1.performFly();
//		cd1.performQuack();
		
		Duck md2 = new MallardDuck(new FlyWithWings(), new Quack());
		md2.display();
		md2.performFly();
		md2.performQuack();
		
	}

}
