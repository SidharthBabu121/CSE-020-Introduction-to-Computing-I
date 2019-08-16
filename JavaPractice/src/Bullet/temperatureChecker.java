package Bullet;
import java.util.Scanner;

public class temperatureChecker {


	public static void main(String[] args) {
		
		
		String choice = "y";
		int i;
		int j = 1;
		int z = 1;
	
		
		double [] values;
		double [] valuesFinal;
		
		Scanner input = new Scanner (System.in);
		
		while(choice.equals("y"))  {
			
			System.out.println("------------------------------------------------------------------------------------");
			System.out.println("-- Please print out the number of Celcius values you wish to input in the machine --");
			System.out.println("------------------------------------------------------------------------------------");
			
			System.out.print(":");
			int max = input.nextInt();
			
			values = new double[max];
			valuesFinal = new double[max];
			
			
			System.out.println(" ");
			System.out.println("Please input your values:");
			for (i = 0; i < (values.length); ++i) {
				System.out.print(j + ": " );
				values[i] = input.nextDouble();
				j++;
			}
				
			System.out.println("\nCalculatiing values from C -> F......Executing");
			
			System.out.println("\n-----------------------------");
			System.out.println("-----     Results       -----");
			System.out.println("-----------------------------");
			
			for (i = 0; i < (values.length); ++i) {
				valuesFinal[i] = (((values[i])*9.0)/5.0) + 32.0;
				System.out.println(z + ":" + valuesFinal[i] + "°F");
				z++;
			}
				
			System.out.println("-----------------------------");
			System.out.print("\nWould you like to try again? y or n :");
			choice = input.next();
		}
		 System.out.println("\nGoodBye !");
		
		
		
		
		
		
		
		

	}

}
