package recursive_pattern_printing;

// Import library to scan the console for user input 
import java.util.Scanner;

/*
 * Developer: Brady Lange
 * Course: Data Structures & Algorithms - CSIS 237
 * Class: StarPrinting 
 * Language: Java
 * Date: 3/11/18
 * Description: This class uses recursion to print out a star pattern based upon a value of lines given.
 */

// This class contains attributes related to printing stars with a recursion algorithm
public class StarPrinting 
{
	// Instance variables 
	Scanner console = new Scanner(System.in);										// Scanner for user input 
// ------------------- Print Star Pattern Method -------------------
	// Method that uses a recursive algorithm to print stars in a pattern
	public void printStarPattern(int input)
	{
		// Check if the input entered is less than zero - error handling 
		while (input < 0)															// Continue until input is greater than zero, error handling 
		{
			System.out.println("Error: You can only input positive numbers.\nPlease try again: ");
			input = console.nextInt();
			if (input > 0)															// Correct input leave the loop, input is greater than zero
			{
				console.close();													// Close the scanner 
				break;																// Exit while loop
			}
		}
		
		if (input == 0)																// Base Case: Input equals zero go to the next for loop
		{
			return;																	
		}
		
	    for (int i = 0; i < input; i++)												// Input is not equal to zero, print from the input down to one
	    {	
	    	System.out.print("*");													// Print star - next line of stars 
	    }
	    System.out.println();														// Print blank line 
	    
	    printStarPattern(input - 1);												// Recursion: Input minus one 
	
	    for (int i = 0; i < input; i++)												// Input is equal to zero this for loop will be executed
	    {
	    	System.out.print("*");													// Print star
	    }
	    System.out.println();														// Print blank line - next line of stars 
	}
// ------------------- End Print Star Pattern Method -------------------
} // End of class StarPrinting 
