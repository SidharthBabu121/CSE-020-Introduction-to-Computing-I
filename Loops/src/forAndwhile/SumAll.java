package forAndwhile;


import java.util.Scanner;

public class SumAll{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int total = 0;

		System.out.print("Please enter the max number you wish to find the sum of: ");

		int max = input.nextInt();
		
		for (int i = 0; i <= max; i++) {
		        System.out.println("Number " + i);
		        total += i;

		}
		System.out.println("Sum of all values: " + total);
	}
}
