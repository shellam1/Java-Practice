/********************************
* Phone Selection Lab
* Nana Afia and Asia Shell
* CMSC 255 - Section 004
* This program takes an input of a single letter and displays the corresponding digit on the telephone. 
* Feb. 13, 2019
*********************************/
import java.util.Scanner;

	public class PhoneSelection
	{
	public static void main(String[] args)
	{
		//Request user input for letter
	Scanner sc = new Scanner(System.in);
	char again = 'Y';
	while (again == 'Y') {
		System.out.println("Enter a single letter, and I will tell you what the corresponding digit is on the telephone.");
		//Declare the letter variable
		char letter = sc.next().charAt(0);
		letter = Character.toUpperCase(letter);
		//Write conditonal statements corresponding to letter input
		//If the user inputs an 'A', 'B', or 'C' then the program outputs 2; 
		if (letter == 'A' || letter == 'B' || letter == 'C') {
			System.out.println("The digit 2 corresponds to the " + letter + " on the telephone.");
		}
		// If the user inputs an 'D', 'E', or 'F' then the program outputs 3; 
		else if (letter == 'D' || letter == 'E' || letter == 'F') {
			System.out.println("The digit 3 corresponds to the " + letter + " on the telephone.");
		}
		// If the user inputs an 'G', 'H', or 'I' then the program outputs 4; 
		else if (letter == 'G' || letter == 'H' || letter == 'I') {
			System.out.println("The digit 4 corresponds to the " + letter + " on the telephone.");
		}
		// If the user inputs an 'J', 'K', or 'L' then the program outputs 5; 
		else if (letter == 'J' || letter == 'K' || letter == 'L') {
			System.out.println("The digit 5 corresponds to the " + letter + " on the telephone.");
		}
		// If the user inputs an 'M', 'N', or 'O' then the program outputs 6; 
		else if (letter == 'M' || letter == 'N' || letter == 'O') {
			System.out.println("The digit 6 corresponds to the " + letter + " on the telephone.");
		}
		// If the user inputs an 'P', 'Q', or 'R' then the program outputs 7; 
		else if (letter == 'P' || letter == 'Q' || letter == 'R' || letter == 'S') {
			System.out.println("The digit 7 corresponds to the " + letter + " on the telephone.");
		}
		// If the user inputs an 'T', 'U', or 'V' then the program outputs 8; 
		else if (letter == 'T' || letter == 'U' || letter == 'V') {
			System.out.println("The digit 8 corresponds to the " + letter + " on the telephone.");
		}
		// If the user inputs an 'W', 'X', or 'Z' then the program outputs 9; 
		else if (letter == 'W' || letter == 'X' || letter == 'Y' || letter == 'Z') {
			System.out.println("The digit 9 corresponds to the " + letter + " on the telephone.");
		}
		// If the user does not input a roman letter an error is raised; 
		else {
			System.out.println("You did not enter a letter.");
			System.out.println("Do you want to try again? <Y/N> ");
			again = sc.next().charAt(0);
		}
		// Requests if the user would like to start again. Loops program from beginning;  
		System.out.println("Do you want to try again? <Y/N> ");
		again = sc.next().charAt(0);
	}
}
		}