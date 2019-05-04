package Bullet;

import java.util.Scanner;

public class Errors1 {

	public static void main(String[] args) {
	//	System.out.println("Can you spot and fix the errors?);
		System.out.println("Can you spot and fix the errors?");

		/*
		 * Sysrem.ou.println("Enter two number and I will ");
		 * System.out.println("add them for you");
		 */
		System.out.print("Enter two numbers and I will ");
		System.out.println("add them for you: ");

		float n1, n2;
    /*
		Scanner keyboard = new Scanner(System.in)
		n1 = next.Int();
		n2 = nextint();
     */
		Scanner keyboard = new Scanner(System.in);
		n1 = keyboard.nextFloat();
		n2 = keyboard.nextFloat();
		
	//	System.println("The sum of the numbers is");
		System.out.println("The sum of the numbers is: ");
	//	System.out.println(n1 - n2);
		System.out.println(n1 + n2);
	}
}