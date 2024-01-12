import java.util.*;
public class Prac95 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			//Conversion of temperature Fahrenheit to Celsius

			System.out.println("Enter the farenheit degree");
			double fahrenheit = sc.nextDouble();
			double celcious = (fahrenheit-32)*(5/9);
			System.out.println(celcious + " °C");
	}

}
