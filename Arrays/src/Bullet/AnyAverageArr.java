package Bullet;

import java.util.Scanner;

public class AnyAverageArr {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int max = 0;
	    int sum = 0;
	    int u = 0;
	    int average;		
	   
		System.out.println("This program will find the average of any numbers");
		System.out.print("Please choose amount of numbers to average : ");

        max = input.nextInt();
        int a[] = new int[max];
        
        System.out.println(" ");
        System.out.println("Input all the values:");
        
        for(int i = 0; i < max ; i++)

        {
        	System.out.print("Please Enter " + u + " Number :");
        	u++;
            a[i] = input.nextInt();
            sum = sum + a[i];
            
        }
        
        System.out.println(" ");
        System.out.println("The values being averaged are:");
        
        for(int i = 0; i < max ; i++) 
        
        {
        	if (i % 5 == 0 && i > 0) {
                System.out.println();
            }
            System.out.print(a[i] + " ");
            
        }
        
        average = sum / max;
        System.out.println("The Average is : " + average);

      }
	}



