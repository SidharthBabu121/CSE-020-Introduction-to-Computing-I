package Bullet;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String letter;
		System.out.print("Please enter a number 0-25: ");
		double num = input.nextInt();
		
		System.out.println("You have entered " + num);

		if (num >= 0 && num <= 25) {
		
		   System.out.println(num + "character of the alphabet: " + (char)(65+num));
		}
	}

}
