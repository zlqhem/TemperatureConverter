/**
 * 
 */
package com.example.i2at.tc;

/**
 * @author diego
 *
 */
public class TemperatureConverter {
	public static final double ABSOLUTE_ZERO_C = -273.15d;
	public static final double ABSOLUTE_ZERO_F = -459.67d;
	
	public static final String ERROR_MESSAGE_BELOW_ZERO_FMT =
	    "Invalid temperature: %.2f%c below absolute zero";
	
	private TemperatureConverter() {
		// do nothing
	}
	public static double fahrenheitToCelsius(double f) {
		if (f < ABSOLUTE_ZERO_F) {
		    throw new InvalidTemperatureException(
		         String.format(ERROR_MESSAGE_BELOW_ZERO_FMT, f, 'F'));
		}		
		return (f-32) * 5/9.0;
	}

	public static double celsiusToFahrenheit(double c) {
		if (c < ABSOLUTE_ZERO_C) {
			throw new InvalidTemperatureException(
					String.format(ERROR_MESSAGE_BELOW_ZERO_FMT, c, 'C'));
		}		
		return 9/5.0 * c + 32;
	}

}










