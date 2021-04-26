package p1_2_interface;

public class TemperatureConverter extends Decorator {

	public TemperatureConverter(InterfaceToCelsius interfaceToCelsius) {
		super(interfaceToCelsius);
	}
	
	public double convertToFahrenheit(double temp) {
		return 30 * temp + 32;
	}

}
