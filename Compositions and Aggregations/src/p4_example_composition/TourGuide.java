package p4_example_composition;

public class TourGuide {
	private Passenger passenger;
	private Pilot pilot;
	
	public TourGuide() {
		passenger = new Passenger();
		pilot = new Pilot();
	}
}
