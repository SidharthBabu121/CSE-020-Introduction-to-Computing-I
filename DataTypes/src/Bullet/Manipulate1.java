package Bullet;

import java.util.Scanner;

public class Manipulate1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("---------------------------Test1--------------------------------");
	      System.out.println("Please type your first integer number: ");
	      Scanner scan = new Scanner (System.in);
	      int n1 = scan.nextInt();
	      System.out.println("Please type your second integer here: ");
	      int n2 = scan.nextInt();
	      
	      int answer1 = n1 + n2;
	      int answer2 = n1 - n2;
	      int answer3 = n1 * n2;
	      int answer4 = n1/ n2;
	      int answer5 = n1 % n2; 

	      System.out.println("The following operations and answers are compiled as such: ");
	      System.out.println("Addition: "  + n1 + " + " + n2 + " = " + answer1);
	      System.out.println("Substraction: "  + n1 + " - " + n2 + " = " + answer2);
	      System.out.println("Multiplication: "  + n1 + " * " + n2 + " = " + answer3);
	      System.out.println("Division: "  + n1 + " / " + n2 + " = " + answer4);
	      System.out.println("Remainder: "  + n1 + " / " + n2 + " = " + answer5);
	      System.out.println(" ");
	      
	      System.out.println("---------------------------Test 2-------------------------------");
	      System.out.println(" Please type your first short value: ");
	      short n11 = scan.nextShort();
	      System.out.println(" Please type your second short value: ");
	      short n12 = scan.nextShort();
	      
	      short answer11 = (short) (n11 + n12);
	      short answer12 = (short) (n11 - n12);
	      short answer13 = (short) (n11 * n12);
	      short answer14 = (short) (n11/ n12);
	      short answer15 = (short) (n11 % n12); 

	      System.out.println(" The following operations and answers are compiled as such: ");
	      System.out.println("Addition: "  + n11 + " + " + n12 + " = " + answer11);
	      System.out.println("Substraction: "  + n11 + " - " + n12 + " = " + answer12);
	      System.out.println("Multiplication: "  + n11 + " * " + n12 + " = " + answer13);
	      System.out.println("Division: "  + n11 + " / " + n12 + " = " + answer14);
	      System.out.println("Remainder: "  + n11 + " / " + n12 + " = " + answer15);
	      System.out.println(" ");
	  
	      System.out.println("---------------------------Test 3-------------------------------");
	      System.out.println(" Please type your first float value: ");
	      float n13 = scan.nextFloat();
	      System.out.println(" Please type your second float value: ");
	      float n14 = scan.nextFloat();
	      
	      float answer16 = n13 + n14;
	      float answer17 = n13 - n14;
	      float answer18 = n13 * n14;
	      float answer19 = n13 / n14;
	      float answer20 = n13 % n14; 

	      System.out.println(" The following operations and answers are compiled as such: ");
	      System.out.println("Addition: "  + n13 + " + " + n14 + " = " + answer16);
	      System.out.println("Substraction: "  + n13 + " - " + n14 + " = " + answer17);
	      System.out.println("Multiplication: "  + n13 + " * " + n14 + " = " + answer18);
	      System.out.println("Division: "  + n13 + " / " + n14 + " = " + answer19);
	      System.out.println("Remainder: "  + n13 + " / " + n14 + " = " + answer20);
	      System.out.println(" ");

	      System.out.println("---------------------------Test 4-------------------------------");
	      System.out.println(" Please type your first double value: ");
	      double n15 = scan.nextDouble();
	      System.out.println(" Please type your second double value: ");
	      double n16 = scan.nextDouble();
	      
	      float answer21 = (float) (n15 + n16);
	      float answer22 = (float) (n15 - n16);
	      float answer23 = (float) (n15 * n16);
	      float answer24 = (float) (n15 / n16);
	      float answer25 = (float) (n15 % n16); 

	      System.out.println(" The following operations and answers are compiled as such: ");
	      System.out.println("Addition: "  + n15 + " + " + n16 + " = " + answer21);
	      System.out.println("Substraction: "  + n15 + " - " + n16 + " = " + answer22);
	      System.out.println("Multiplication: "  + n15 + " * " + n16 + " = " + answer23);
	      System.out.println("Division: "  + n15 + " / " + n16 + " = " + answer24);
	      System.out.println("Remainder: "  + n15 + " / " + n16 + " = " + answer25);
	      System.out.println(" ");
	     
	}

}
