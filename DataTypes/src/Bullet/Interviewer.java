package Bullet;

import java.util.Scanner;

public class Interviewer {

	public static void main(String[] args) {
		
		String name;
		String major;
		String color;
		String food;
		int age;
		int weight;
		int answer;
		
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
		System.out.println("What is your weight in lbs? (Number only please) ");
		weight = scnr.nextInt();
		
		 answer =  (int) (weight / 2.2);
		
		System.out.println(" ");
		System.out.print("Hello, My name is D122-A121 and ");
		System.out.print("I interviewed ");
		System.out.print(name + ".");
		System.out.print("Your age is ");
		System.out.print(age + ".");
		System.out.print("Your favorite color is ");
		System.out.print(color + ".");
		System.out.print("Your intended major is ");
		System.out.print(major + ".");
		System.out.print("Your favorite food is " );
		System.out.print(food + ".");
		System.out.print("Your weight in kgs is " );
		System.out.print(answer + ".");
		
		System.out.println(" ");
		System.out.println("---------------------------------");
		System.out.print("The following a non-profit " );
		System.out.print("survey. Disclamers are not advised!" );
		System.out.println(" ");
		System.out.println("---------------------------------");
		
	}

}
