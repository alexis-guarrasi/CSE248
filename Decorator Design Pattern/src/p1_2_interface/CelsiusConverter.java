package p1_2_interface;

public class CelsiusConverter implements InterfaceToCelsius{

	@Override
	public double convertToCelsius(double temp) {
		return (temp - 32) * 0.5556;
	}

}
