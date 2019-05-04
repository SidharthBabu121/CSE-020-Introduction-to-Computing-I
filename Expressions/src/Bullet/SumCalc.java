package Bullet;

import java.util.Scanner;

public class SumCalc {

	public static void main(String[] args) {

		int n1;
		int n2;
		int answer;
		
		System.out.println("Enter two ints and we print out sum as an int.");

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		n1 = keyboard.nextInt();

		System.out.print("Enter the second number: ");
		n2 = keyboard.nextInt();

      		answer = n1 + n2;
		System.out.println("The sum of the numbers is " + answer);
        
	}

}
