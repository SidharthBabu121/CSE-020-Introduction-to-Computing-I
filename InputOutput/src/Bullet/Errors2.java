package Bullet;

import java.util.Scanner;

public class Errors2 {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		/*
		int number = 0;
		int theSquare = 0;
		*/
		int number;
		int theSquare;
		
		//System.out.print("Enter a number and I will ")		
		System.out.println("Enter a number and I will square it for you: ");
		
		//	number =  keyboard.nextInt;
		number = kbd.nextInt();
		
		//thesquare = number * number;
		theSquare = number * number;
	
		// System.out.print(number + " squared = ";
		// System.ou.println("theSquare");
		System.out.print(number + " squared = ");
		System.out.println(theSquare);
	}
}