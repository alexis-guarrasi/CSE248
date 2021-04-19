package p1;

public class Demo {

	public static void main(String[] args) {
		EnemyShipFactory shipFactory = new EnemyShipFactory();
		EnemyShip s1 = shipFactory.createEnemyShip("Medium");
		System.out.println(s1.toString());
	}

}
