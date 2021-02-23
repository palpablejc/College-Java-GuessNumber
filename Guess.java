import java.util.Scanner;
/** 
*CIS 225-01 Number guessing game
*@version 1.0 9/23/16
*@author John Carter
*/

public class Guess {
	public static void main(String[] args) {
	/**
	*program entry point
	*/

	//declare vars
	int number;
	
	//Generate numbers
	number = (int) System.currentTimeMillis() % 10;

	Scanner input = new Scanner(System.in);

	//Promt
	System.out.println("Guess a number between 0 and 9");

	//input: guess from user
	int userGuess = input.nextInt();

	//processing
	if (userGuess == number) {
		System.out.println("Correct");
	} else if (userGuess > number) {
		System.out.println("Guess too high");
	} else {
		System.out.println("Guess too low");
	}

  }
}
	