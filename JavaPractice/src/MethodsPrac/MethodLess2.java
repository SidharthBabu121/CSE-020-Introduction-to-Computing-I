package MethodsPrac;

import java.util.*;

public class MethodLess2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double ftemp;
		double ctemp;
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a temperature in Fahrenheit(°F): ");
		ftemp = input.nextDouble();
		ctemp = ftoc(ftemp);
		System.out.println("The temperature in Celcius is about " + ctemp + "°C");
		
		
		System.out.print("\nEnter a temperature in Celcius(°C): ");
		ctemp = input.nextDouble();
		ftemp = ctof(ctemp);
		System.out.println("The temperature in Fahrenheit is about " + ctemp + "°F");
		
		
		

	}
	static double ftoc (double temp) {
		double celcius;
		
		celcius = (temp - 32.0) * (5.0/9.0);
		return Math.round(celcius);
		
	}
	
	static double ctof (double temp) {
		
		double fahrenheit;
		
		fahrenheit = (temp * (9.0/5.0)) + 32.0;
		return Math.round(fahrenheit);
	
	}
}
