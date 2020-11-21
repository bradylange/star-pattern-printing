package recursive_pattern_printing;

// Importing a library to be able to get the user input 
import java.util.Scanner;

/*
 * Developer: Brady Lange
 * Course: Data Structures & Algorithms - CSIS 237
 * Class: StarPrintingApplication
 * Language: Java
 * Date: 3/11/18
 * Description: This program tests the functionality of the recursion algorithm that prints stars in a pattern based on the number of lines declared.
 */

// This program tests the functionality of the recursion algorithm in printing stars 
public class StarPrintingApplication
{
// ------------------- Main Method -------------------
	// Method that compiles and runs the program 
	public static void main(String [] args) 
	{
		// Scanner for the console for the user to input the amount of lines they want the stars to be printed on 
		Scanner console = new Scanner(System.in);
		
		// Instantiate the StarPrinting class
		StarPrinting printPattern = new StarPrinting();

		// Print out the star pattern using recursion 
		System.out.println("***************************************** Recursive Star Printing: *****************************************");
		System.out.println("Enter the number of lines in the star pattern you want to be printed: ");
		int input = console.nextInt();
		System.out.println("Printing out star pattern...\n");
		printPattern.printStarPattern(input);
		System.out.println("\nStar pattern printing finished!");
		System.out.println("********************************************************************************************************");
		
		// Close the scanner
		console.close();
	} 
// ------------------- End Main Method -------------------
} // End of class StarPrintingApplication
