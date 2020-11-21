package recursive_power_calculation;

/*
 * Developer: Brady Lange
 * Course: Data Structures & Algorithms - CSIS 237
 * Class: NumbersWithPowers
 * Language: Java
 * Date: 3/11/18
 * Description: This class uses recursion to calculate a base number with a power.
 */

// This class contains a recursive algorithm that calculates a number that has a power
public class NumbersWithPowers
{
// ------------------- Power Method -------------------
	// Method that uses recursion to take an input of a base and its power and calculates it
	public double power(int base, int power)
	{
		if (power < 0)												// Power is negative
		{
			return power(base, power + 1) / base;					// Recursion: Add one to the power and divide by the base number 
		}
		else if (power == 0)										// Base Case: Power equals zero
		{	
			return 1;												// Return one 
		}
		else if (power == 1)										// Power equals one 
		{
			return base;											// Return the base number 
		}
		else if (base == 0)											// Base equals zero 
		{
			return 0;												// Return zero
		}
		else														// Power is positive
		{
			return power(base, power - 1) * base;					// Recursion: Minus one from the power and multiply by the base number 
		}
	} 
// ------------------- End Power Method -------------------
} // End of class NumbersWithPowers
