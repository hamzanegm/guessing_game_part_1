package guess_the_number_game;

import java.util.Random;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random dice = new Random();
		
		int answer, guess, counter;	
		String userInput;	
		
		answer = 1 + dice.nextInt(100);		
		
		System.out.println("Welcome to the guessing game!\r\n");
		System.out.println("Rules:");
		System.out.println("- The game will have a number that should be guessed. For example, 36.\r\n"
				+ "- Player will guess from a range of numbers.\r\n"
				+ "- The game will output if the guess is greater than or less than.\r\n"
				+ "- The player wins if he guesses the correct number.\r\n");
		System.out.println("Press any keys to start the game. Or press 'x' to exit");
		
		userInput = sc.nextLine();				
		if (userInput.equals("x")) {     
			System.out.println("Program is closed. Thank you for playing!");
			System.exit(0);
		} else {
			counter = 0;
			guess = 0;
			while (guess != answer) {	
				System.out.println("Guess the number from (1 - 100):");
				guess = sc.nextInt();
				if	(guess < answer) {
					System.out.println("The guess is less than the answer");
				} 
				else if (guess > answer) {
					System.out.println("The guess is greater than the answer");
				}
				else {
					System.out.println("Congratulations!!! \r\n"
							+ "you won the game ");	
				}	
				counter++;
				System.out.println("Number of guesses " + counter);
			}	
		}
	}
}	

