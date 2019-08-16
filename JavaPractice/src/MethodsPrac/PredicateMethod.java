package MethodsPrac;
import java.util.*;

public class PredicateMethod {

	/*
	 * A predicate method returns a boolean value either true or false based on a condition.
	 * 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a number:");
		int num = input.nextInt();
		if (isEven(num)) {
			System.out.println("Its a Even number!");
		}
		else 
		{
			System.out.println("It an oddd number!");
		}
		
		System.out.print("Input a String:");
		String string = input.next();
		
		for (int i = 0; i < string.length(); ++i) {
			if(isVowels(string.charAt(i))) {
				System.out.print(string.charAt(i));
			}
		}
		
		
	}
	//Example 1: finding the even number!
	/*
	 * Notice the "is" prefix prior to the word Even, most programmers illustrate the name of
	 * these predicate methods with prefixes and place a boolean return type.
	 */
	static boolean isEven(int number) {
		if (number % 2 == 0) 
			return true;
		else 
			return false;
		
	}
	// Examples 2: check if a string has vowels
	static boolean isVowels (char c) {
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			return true;
		}else {
			return false;
		}
		
		
	}

}
