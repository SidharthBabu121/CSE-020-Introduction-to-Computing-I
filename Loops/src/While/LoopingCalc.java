package While;
import java.util.Scanner;

public class LoopingCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		//Variables:
		double num1;
		double num2;
		double answer;
		String value = "y";
		
		
		//Statements:
		System.out.println("Calculator program: \n--Options-- \n1:Addition \n2:Subtraction \n3:Multiplication \n4:Division ");
		
		
		//While Loop
		while (value.equals("y")) {
			
			System.out.print("\nChoice:");
			int choice = input.nextInt();
			
			if(choice <= 4) {
				System.out.println("\nPlease print out two numerical values:");
				
				System.out.print("Value 1:");
				num1 = input.nextDouble();
				System.out.print("Value 2:");
				num2 = input.nextDouble();
				
				if(choice == 1) {
				  System.out.println("\n--------Addition----------");
				  answer = add(num1, num2);
				  System.out.println("Answer: " + answer);
				}
				else if (choice == 2) {
				  System.out.println("\n--------Subtraction----------");
				  answer = sub(num1, num2);
				  System.out.println("Answer: " + answer);
				}
				else if(choice == 3) {
				  System.out.println("\n--------Multiplication----------");
				  answer = multi(num1, num2);
				  System.out.println("Answer: " + answer);
				}
				else if(choice == 4) {
			      System.out.println("\n--------Divsion----------");
				  answer = div(num1, num2);
				  System.out.println("Answer: " + answer);
				}
				
			}
			else {
				System.out.println("\nError, inputed choice doesn't follow accepted options!");
			}
			
			System.out.print("\nWould you like to try again? y or n :");
			value = input.next();
		}
		System.out.println("\nGoodbye!");
	}

    static double div(double val1, double val2) {
		double finalVal = val1 / val2;
		return finalVal;
	}

	static double multi(double val1, double val2) {
		double finalVal = val1 * val2;
		return finalVal;
	}

	static double sub(double val1, double val2) {
		double finalVal = val1 - val2;
		return finalVal;
	}

	static double add(double val1, double val2) {
		double finalVal = val1 + val2;
		return finalVal;
	}

}
