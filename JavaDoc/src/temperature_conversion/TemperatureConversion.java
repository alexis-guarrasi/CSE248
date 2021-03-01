package temperature_conversion;

//in-line comment
/*
 * block comment
 * 
 */

/**
 * The TemperatureConversion Java application prints a table 
 * converting Celsius to Fahrenheit degrees.
 * 
 * @see <A HREF="../application/TemperatureConversion.java"> Java Source Code </A>
 * 
 * @author chenb
 * 
 * @version v2.1.1
 *
 */

public class TemperatureConversion {
	
	/**
	 * The main method prints a Celsius to Fahrenheit conversion table.
	 * The bounds of the table range from -50C to +50C in 10-degree increments. 
	 * @param args Not used in this implementation
	 */

	public static void main(String[] args) {
		final double TABLE_BEGIN = -50.0; // The table's first Celsius
		final double TABLE_END = 50.0; // The table's final Celsius
		final double TABLE_STEP = 10.0; // Increment between temperatures in table
		
		double celsius;
		double fahrenheit;
		System.out.println("TEMPERATURE CONVERSION");
		System.out.println("-----------------------");
		System.out.println("Celsius\t\tFahenheit");
		for(celsius = TABLE_BEGIN; celsius <= TABLE_END; celsius += TABLE_STEP) {
			fahrenheit = celsiusToFahrenheit(celsius);
			System.out.printf("%6.2fC", celsius);
			System.out.printf("%14.2fF\n", fahrenheit);
		}
		System.out.println("-------------------------");
	}
	
	/**
	 * Convert a temperature from Celsius degrees to Fahrenheit degrees.
	 * 
	 * @param celsius  
	 *        A temperature in Celsius degrees.
	 * @return
	 *        The temperature celsius converted to Fahrenheit
	 *        
	 * @throws java.lang.IllegalArgumentException
	 * 			Indicates the celsius is less than the smallest Celsius temperature (-273.16).
	 */

	public static double celsiusToFahrenheit(double celsius) {
		final double MINIMUM_CELSIUS = -273.15;
		if(celsius < MINIMUM_CELSIUS) {
			throw new IllegalArgumentException("Argument " + celsius + " is too small.");
		}
		return (9.0/5.0) * celsius + 32;
	}

}
