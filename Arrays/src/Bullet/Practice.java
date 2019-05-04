package Bullet;
import java.util.Scanner;
public class Practice {
	
	private int maxValue;
	
	//public static void ArrayChecker (int [], int []) {
		
		
		
	//}
	
	
	
	
	
	
	 public static void main(String[] args) {
	
	
	 int [] arr = {1, 2, 3, 4, 2, 3};
	 int [] answer = new int[arr.length];
	 int max = answer[0];
	 for (int i = 0; i < arr.length; i++) {
		 answer[i] = arr[i] * arr[i];
	     if (answer[i] > max) {
	            max = answer[i];
	         }
	}
	if (answer.length > 0) {
		System.out.println(max);
	} else {
		max = 0;
		System.out.println(max);
	}
	
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("How many numbers are in your list?");
	int val = input.nextInt();
	
	
	
	
	
	
	 }
}
