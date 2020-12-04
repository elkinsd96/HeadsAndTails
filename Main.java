package Exercise;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    
	// Allows user input
	Scanner input = new Scanner(System.in);
    
    //Prints out an instruction for user to enter an input for
	System.out.print("Enter a number between 0 and 511: ");
    
    // Initializes a new integer array named "array" that has a 3 x 3 integer matrix
    int [][] array = new int [3] [3];
    
    // Stores the user input into an integer variable named "decimal"
    int decimal = input.nextInt();
    
    // A For Loop that passes through the rows of the matrix
    for (int row = 0; row < array.length; row++) {
    	
    	//A For Loop that passes through the columns of the matrix 
    	for (int column = 0; column < array[row].length; column++) {
        
    		// An If statement that checks if decimal is equal to 0
    		if (decimal % 2 == 0) 
         
    			// Sets the value of a row and column to 0
    			array[row][column] = 0;
        
    		// An else statement that checks if decimal is equal to anything else but 0
    		else 
    			// Sets the value of a row and column to 0 
    			array[row][column] = 1;
      
    	// Stores a new value for decimal where decimal is divided by 2 
    	decimal = decimal / 2;
      
      }
    } 
    
    // A For Loop that passes through the rows of the matrix in reverse order
    for (int row = array.length-1; row >= 0; row--) {
      
    	// A For Loop that passes through the columns of the matrix in reverse order
    	for (int column = array[row].length-1; column >= 0; column--) { 
    		
    		// An If statement that checks if value of a row and column in array is equal to 0 
    		if (array[row][column] == 0)
    			
    			// Prints out the character "H"
    			System.out.print("H ");
        
    		else
    			// Prints out the character "T"
    			System.out.print("T ");
      }
    
    // Prints to a new line
    System.out.println();
    
    }
  }
}
