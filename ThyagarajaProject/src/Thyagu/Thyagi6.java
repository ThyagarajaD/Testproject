package Thyagu;
import java.util.Scanner;
public class Thyagi6 {

	public static void main(String[] args) {
		TemperatureConverter temperatureConverter = new TemperatureConverter();
		
		double res = temperatureConverter.convertFahrenheitToCelsius(68.0);
		System.out.println("Fahrenheit to Celsius is" +res);
		
	}

}
