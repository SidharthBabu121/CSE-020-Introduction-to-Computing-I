package forAndwhile;

import java.util.Scanner;

public class PosAverage {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = 0;
		int sum = 0;
		do {
		   System.out.print(" Enter Number " + i + " : ");
		   int x = input.nextInt();
		   if (x < 0) {
			   break;
		   }
		   else {
			   i++;
			   sum += x;
		   }
		}while (true);
			
		 System.out.println("Average is " + (sum)/(i));
	}
}
