package Bullet;

import java.util.Scanner;

public class ArrayReviewProgm {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      System.out.println("Print the number of elements you wish to input:");
      int maxValue = scnr.nextInt();             // Number of elements in array
      int[] userVals = new int[maxValue];        // User numbers
      int i;                                // Loop index
      int j = 0;
      int sumVal = 0;
      int max;
      int min;
        	 
    	 System.out.println("Please enter " + maxValue + " integer values...");
         for (i = 0; i < userVals.length; ++i) {
       	 j++;
            System.out.print(j + ": ");
            userVals[i] = scnr.nextInt();
         }
         
         System.out.println("");
         System.out.print("You have entered: ");
         for (i = 0; i < userVals.length; ++i) {
        	if (i % 5 == 0) {
        		System.out.println(" ");
        	}
        	System.out.print(userVals[i] + " ");
        		
         }
         
         System.out.println(" ");
         System.out.println("--------------------------------------");
         System.out.println("- The following data can be infered: - ");
         System.out.println("--------------------------------------");
         
         max = userVals[0];
         min = userVals[0];
         
         for( i = 0; i< userVals.length; ++i ) {
        	 sumVal += userVals[i];
        	 if(userVals[i] > max) {
        		 max = userVals[i];
        	 }
        	 if(userVals[i] < min) {
        		 min = userVals[i];
        	 }
      
         }
         	System.out.println(" ");
         	System.out.println("The sum of all values is: " + sumVal);
         	System.out.println("The Maximum value is: " + max);
         	System.out.println("The Minimum value is: " + min);
         	
         	
         	
          for (i = userVals.length -1; i >= 0; --i) {
             System.out.print(userVals[i] + " ");
             }
          for (i = 0; i < userVals.length; ++i) {
          	 System.out.print(userVals[userVals.length - 1 - i]);
          }
          
   }
   
   

   
   
   
   
   
   
   
   
   
   
}