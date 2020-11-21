package recursive_power_calculation;

// Import library to scan for user input 
import java.util.Scanner;

/*
 * Developer: Brady Lange
 * Course: Data Structures & Algorithms - CSIS 237
 * Class: NumbersWithPowersApplication
 * Language: Java
 * Date: 3/11/18
 * Description: This program tests the functionality of the recursive algorithm used in the RecursivePower class.
 */

// This class inputs a base number and power to the base number and calculates it with a recursive method that is called
public class NumbersWithPowersApplication
{
// ------------------- Main Method -------------------
	// Method that compiles and runs the program 
	public static void main(String [] args) 
	{
		// Scan for user input 
		Scanner console = new Scanner(System.in);
		
		// Instantiate the class RecursivePower
		NumbersWithPowers number = new NumbersWithPowers();
		
		// Call the method that will calculate a number with a power recursively 
		System.out.println("***************************************** Recursive Numbers with Powers Calculation: *****************************************");
		System.out.print("Please enter the base number: ");
		int bInput = console.nextInt();
		System.out.print("Please enter the power: ");
		int pInput = console.nextInt();
		System.out.println("\n********************************************************************************************************");
		System.out.println("Result: " + number.power(bInput, pInput));
		System.out.println("********************************************************************************************************");
		
		// Close the scanner 
		console.close();
	}
// ------------------- End Main Method -------------------
} // End of class NumbersWithPowersApplication
