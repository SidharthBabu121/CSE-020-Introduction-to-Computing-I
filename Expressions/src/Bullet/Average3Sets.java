package Bullet;

import java.util.Scanner;

public class Average3Sets {

	public static void main(String[] args) {
		System.out.println("This program will ask the user for three sets of two numbers and will calculate the average of each set.");

       	int n1;
       	int n2;
		int average;
		float n3;
		float n4;
		float floatAvg;
		short s1;
		short s2;
		short shortAvg;
        
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the first number:");
		n1 = input.nextInt();

		System.out.println("Please enter the second number:");
		n2 = input.nextInt();

		average = (n1+n2)/2;
		System.out.println("The average of the numbers is " + average);

        	System.out.println("---------------------------------------------------------------");

		System.out.println("Please enter the first number:");
		n3 = input.nextFloat();

		System.out.println("Please enter the second number:");
		n4 = input.nextFloat();

		floatAvg = (n3+n4)/2;
		System.out.println("The average of the numbers is " + floatAvg);

        	System.out.println("---------------------------------------------------------------");

		System.out.println("Please enter the first number:");
		s1 = input.nextShort();

		System.out.println("Please enter the second number:");
		s2 = input.nextShort();

		shortAvg = (short)((n1+n2)/2);
		System.out.println("The average of the numbers is " + shortAvg);

	}

}
