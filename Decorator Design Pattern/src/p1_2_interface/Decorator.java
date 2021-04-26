package p1_2_interface;

public abstract class Decorator implements InterfaceToCelsius{
	private InterfaceToCelsius interfaceToCelsius;
	
	public Decorator(InterfaceToCelsius interfaceToCelsius) {
		this.interfaceToCelsius = interfaceToCelsius;
	}
	
	public double convertToCelsius(double temp) {
		return interfaceToCelsius.convertToCelsius(temp);
	}
}
