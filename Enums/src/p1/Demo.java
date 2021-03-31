package p1;

public class Demo {

	public static void main(String[] args) {
		TrailType t1 = TrailType.LOOP;

		for (TrailType tr : TrailType.values()) {
			System.out.println(tr);
		}

		TrailType trailType1 = TrailType.LOOP;
		switch (trailType1) {
		case LOOP:
			System.out.println("loop");
			break;
		case OUT_AND_BACK:
			System.out.println("Out and Back");
			break;
		case POINT_TO_POINT:
			System.out.println("Point to Point");
			break;
		}
		
		TrailType t2 = TrailType.valueOf("LOOP");
		System.out.println(t2.toString());
		
		System.out.println(TrailType.OUT_AND_BACK);
	}

}
