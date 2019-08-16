package MethodsPrac;
import java.util.*;


public class ThreeExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	 double tip, bill;
	 Scanner input = new Scanner (System.in);
	 
	 System.out.println("Method 1: Tip Calc");
	 System.out.print("\nEnter the bill: ");
	 bill = input.nextDouble();
	 tip = tipCalc(bill);
	 System.out.println("The value of the tip is: " + tip);
	 
	 System.out.println("\nMethod 2: Discounted Price");
	 System.out.print("\nEnter the original cost of the object of interest: ");
	 double total = input.nextDouble();
	 System.out.print("Enter the discount percent:  ");
	 double discount = input.nextDouble();
	 double disPrice = disPricCalc(total, discount);
	 System.out.println("The discounted price of the object is " + disPrice + ".");
	}

	 static double disPricCalc(double amount, double percent) {
		// TODO Auto-generated method stub
		double finalVal = amount - (amount * (percent/100));
		return Math.round(finalVal);
	}

	static double tipCalc(double value) {
		double fval = value * 0.19;
		return fval;
	}

}
