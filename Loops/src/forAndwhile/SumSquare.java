package forAndwhile;

import java.util.Scanner;

public class SumSquare{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int total = 0;
		
		System.out.print("Please enter the max number: ");
		int max = input.nextInt();
		
		for (int i = 1; i <= max; i++) {
				int answer = i*i;
		        System.out.println("Number " + i + " squared is " + (answer));
		        total += answer;
		}
	       System.out.println("The total is " + total);
	}
}
