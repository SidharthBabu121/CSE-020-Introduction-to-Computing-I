package MethodsPrac;

public class MethodsLess1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numb = 12;
		System.out.println("The num: " + numb + " squared is " + square(numb));
	    
		/* Notice in the statement above the phrase square(numb)
			- this is the argument statement
				- In this case I use the name square followed by the data that I want the method to work with.
				- Remember, The key thing to remember about parameters(shown below) and arguments is
				  they have to match in the data type and the number.	
				  	- I just have to make sure that I have a
				  	  single integer argument to be sent to the square method.
		*/
	}

	
	//Method 1:
	
	/*
	 * Methods must be placed either before the main method or after it:
	 * This ban be done in something called a method definition: seen in the (static int squar...) below
		- static: means the program can be run anywhere
		- int: return type:
		 		- the return type of the data that's going to be returned(in this case its integers)
		- square: the name of the method
		- int number: this is the parameter statement:
				- this statement provides data that we want the method to transform in some way.
				- Remember, The key thing to remember about parameters and arguments(shown above) is
				  they have to match in the data type and the number.
				  	- So for example, in this square definition, I have one integer parameter. So in my method call,
				  	  I need to have one integer argument, num. I don't have to put the data type, the data type is 
				  	  already declared back here, when we declared the variable. 
	*/
	
	static int square(int number) {
		
		/*
		 * Following the method definition comes the body, seen in below. Because since there is no void in the method definition,
		 * program must return a statement.
		*/
		
		
		int number2 = number * number;
		return number2;
		
	}
	
	
	/*
	 * ----------------------------------
	 *            Summary
	 * ----------------------------------
	 * The method call begins with a keyword static if our method is not attached to an object or a class. We'll talk more about that later.
	 * Then, we have the return data type for the method.

		Not all methods have to have return data types.
		You can't have a method that performs a task with that returning data.
		Let's call a void method and we'll talk about those later in the next lesson.
		Then, that's followed by the method name.
		After the method name comes the parameter or parameters, that
		consist of the data that we're passing to the method.
		This is, also called the parameter list, because it can be one or more.
		And actually it can be zero.You don't have to pass parameters, but, a lot of times you will.

		Then, after that is the method body, which begins with an opening curly brace.
		And then whatever Code we need to perform the task of the method,somewhere in the method definition,
		 if it's a data returning method, which this one is since we declared int right
		there, there has to be, what's called a return statement.
		In this case our whole method definition is a return
		statement, cuz we're simply gonna return the parameter, multiplied times itself.
		Then to use the method, we simply have a method call where we call the name of the
		method followed by an argument where the argument matches the parameter list.So square has one integer parameter.
		So the method call square has to have one integer argument.So that'll wrap up this lesson on methods.
	 */
	
	
	
	
	
	
	
	
	
	
	
	
}
