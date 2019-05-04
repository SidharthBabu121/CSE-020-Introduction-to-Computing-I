package Bullet;
import java.util.Scanner;

public class Errors3

{
	public static void main(String[] args) {
	/*
		Scanner kbd = new Scanner System.in;
		Int numerator;
		integer denominator;
	*/
		Scanner kbd = new Scanner(System.in);
		int numerator;
		int denominator;
	/*
		System.println("This program divides two numbers.");
		System.print("Enter the numerator: ");
	*/
		System.out.println("This program divides two number. ");
		System.out.println("Enter the numerator: ");
		numerator = kbd.nextInt();
		System.out.print("Enter the denominator: ");
	   //denomintaor = kbd.nextInt();
		denominator = kbd.nextInt();
		
 /*
		system.out.print(numerator);
		System.out.print("/");
		system.out.Print(denominator);
		System.out.print(" = ");
		System.out.Println((double) numerator/denominator);
*/
		System.out.println(numerator + " / " + denominator + " = ");
		System.out.println((double) numerator/denominator);
	}

}