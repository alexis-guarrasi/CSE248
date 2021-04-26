package p1_2_interface;

public class Demo {

	public static void main(String[] args) {
		CelsiusConverter celsiusConverter = new CelsiusConverter();
		System.out.println(celsiusConverter.convertToCelsius(32));
		
		TemperatureConverter temperatureConverter1 = new TemperatureConverter(celsiusConverter);
		System.out.println(temperatureConverter1.convertToCelsius(32));
		System.out.println(temperatureConverter1.convertToFahrenheit(0));
	}

}
