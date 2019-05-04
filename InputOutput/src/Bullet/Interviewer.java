package Bullet;

import java.util.Scanner;

public class Interviewer {

	public static void main(String[] args) {
		
		String name;
		String major;
		String color;
		String food;
		int age;
		
		System.out.println("---------------------------------");
		System.out.println("------------Questions------------");
		System.out.println("---------------------------------");
	
		System.out.println(" ");	
		System.out.println("what is your name? ");
		Scanner scnr = new Scanner(System.in);
		name = scnr.nextLine();
		
		System.out.println(" ");
		System.out.println("what is your age?");
		age = scnr.nextInt();
		
		System.out.println(" ");
		System.out.println("what is your intended major? ");
		major = scnr.next();
		
		System.out.println(" ");
		System.out.println("what is your favorite color? ");
		color = scnr.next();
		
		System.out.println(" ");
		System.out.println("what is your favorite food? ");
		food = scnr.next();
		
		
		
		System.out.println(" ");
		System.out.print("Hello, My name is D122-A121 and ");
		System.out.println("I interviewed ");
		System.out.println(name);
		System.out.println("Your age is ");
		System.out.println(age);
		System.out.println("Your favorite color is ");
		System.out.println(color);
		System.out.println("Your intended major is ");
		System.out.println(major);
		System.out.println("Your favorite food is " );
		System.out.println(food);
		
		System.out.println(" ");
		System.out.println("---------------------------------");
		System.out.print("The following a non-profit " );
		System.out.print("survey. Disclamers are not advised!" );
		System.out.println(" ");
		System.out.println("---------------------------------");
		
	}

}
