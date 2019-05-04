package forAndwhile;

import java.util.Scanner;

public class Multiples{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	

		System.out.print("Please enter the max number you wish to find the multiples of: ");
		int max = input.nextInt();
		
		System.out.print("Please enter the base number: ");
		int base = input.nextInt();
		
		for (int i = base; i <= max; i+=base) {
		        System.out.println("Number " + i);
		            if ((i > max))
		                break;
		}
	
	}
}
