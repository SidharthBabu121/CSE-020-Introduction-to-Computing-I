package While;

import java.util.Scanner;

public class AnyAverage{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count, total, runningCount;

		System.out.print("Please enter the maximum number of values you wish to average: ");
		count = input.nextInt();

		runningCount = count;
		total = 0;
		
		while (runningCount > 0) {
				System.out.print("Please enter " + (count - runningCount) + " number: ");
				int num = input.nextInt();
				total += num;
				runningCount--;
			    
		}
		if (count > 0)
			System.out.println("The Average is " + (total/count));
		else
			System.out.println("There are no numbers to average");
	}
}
