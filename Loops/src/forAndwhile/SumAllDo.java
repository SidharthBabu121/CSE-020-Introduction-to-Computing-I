package forAndwhile;

import java.util.Scanner;

public class SumAllDo{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int total = 0;

		System.out.print("Please enter the max number you wish to find the sum of: ");

		int max = input.nextInt();
		int i = 0;
		
		do {
	        System.out.println("Number " + i);
		    total += i;
			i++;
		}while ( i <= max);
		
		System.out.println("Sum of all values: " + total);
	}
}
