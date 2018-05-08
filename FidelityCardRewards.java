/*	Author: Alexis Dionne
 * 	Fidelity Card Rewards calculates the number of latte and tictacs.
 * 	Started on: 08/05/2018
 */

import java.util.Scanner;

public class FidelityCardRewards {

	public static void main(String[] args) {
		// MY VARIABLES AND CONSTANTS
		Scanner userInput = new Scanner(System.in);
		int card1, card2, card3, card4, cardTotal, numberOfLattes, numberOfTictacs, numberOfStarsLeft;
		final int STARS_FOR_LATTE = 7;
		final int STARS_FOR_TICTACS = 2;
		
		// Step 1, greet the user
		System.out.println("===========================================");
		System.out.println("Welcome to the Fidelity Card Rewards System");
		System.out.println("===========================================\n");
		
		
		// Step 2, ask the user for the number of stars on each card.
		System.out.print("Please enter the number of stars on card 1: ");
		card1 = userInput.nextInt();
		System.out.print("Please enter the number of stars on card 2: ");
		card2 = userInput.nextInt();
		System.out.print("Please enter the number of stars on card 3: ");
		card3 = userInput.nextInt();
		System.out.print("Please enter the number of stars on card 4: ");
		card4 = userInput.nextInt();
		System.out.println("");
		
		// Step 3, tell the user how many stars she has in total
		cardTotal = (card1+card2+card3+card4);
		System.out.println("You have a total of " + cardTotal + " stars");
		
		// Step 4, calculate the number of lattes available
		numberOfLattes = (cardTotal/STARS_FOR_LATTE);
		
		// Step 5, calculate the number of tictacs available
		// Find the remainder of "cardTotal % STARS_FOR_LATTE" and divide it by STAR_FOR_TICTACS
		numberOfTictacs = ((cardTotal%STARS_FOR_LATTE)/STARS_FOR_TICTACS);
		
		// Step 6, calculate the number of stars left after
		numberOfStarsLeft = (cardTotal - (numberOfLattes*STARS_FOR_LATTE) - (numberOfTictacs*STARS_FOR_TICTACS));
		
		// Step 7, output the results, thanks the user and close scanner
		System.out.println("You could redemm them for " + numberOfLattes + " latte(s), " + numberOfTictacs + " tic-tac(s) and you will have " + numberOfStarsLeft + " star left.\n");
		System.out.println("Thank for trusting the Fidelity Card Rewards System with your precious stars.");	
		userInput.close();

	}

}
