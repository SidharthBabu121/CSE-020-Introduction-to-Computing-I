package While;

import java.util.Scanner;

public class EvenAndOddNumber {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number: ");
		int max = input.nextInt();
		
		System.out.println("\nEven Numbers:");
		while ( i <= max) {
			
		    if (i % 2 == 0 && i != 0)
			    System.out.print(i + ",");
			    i++;
		}
		
		System.out.println(" ");
		
		
		System.out.println("\nOdd Numbers:");
		while ( j <= max) {
		    if (j % 2 != 0 && j != 0)
			    System.out.print(j + ",");
			    j++; 
		}
	}
}
