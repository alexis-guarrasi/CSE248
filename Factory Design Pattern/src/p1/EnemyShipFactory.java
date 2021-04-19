package p1;

public class EnemyShipFactory {

	public EnemyShip createEnemyShip(String shipType) {
		switch (shipType.toLowerCase()) {
		case "large":
			return new LargeEnemyShip();
		case "medium":
			return new MediumEnemyShip();
		case "small":
			return new SmallEnemyShip();
		default:
			return null;
		}
	}
}
