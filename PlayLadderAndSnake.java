/**
 * @author Malak Abdelkafy(40235257)
 * COMP 249
 * Assignment 1
 * Due Date: February 6, 2023
 */


/**
 * Part 2
 */

import java.util.Scanner;
/**
 * contains main method
 */
public class PlayLadderAndSnake {

	/**
	 * main method
	 * checks if user input is 2 the proceeds to start the game.
	 * @param args array
	 */
	public static void main(String[] args) {
		
		System.out.println("This game should be played by 2 players.");
		System.out.println("Enter the number of players: ");
		Scanner scan = new Scanner(System.in);
		int playerNum = scan.nextInt();
		
		int attempt = 1;
		
		while(playerNum != 2) 
		{
			
			System.out.println("Initialization was attempted for " + playerNum + " players;\nhowever, this is only expected for an extended version the game.\nTry again");
			attempt++;
			playerNum = scan.nextInt();
			
			if(attempt == 3) 
			{
				System.out.println("Error! Cannot execute the game with less than 2 players. Will terminate.");
				scan.close();
				System.exit(0);
				return;
			}
		}
		
		scan.close();
		LadderAndSnake las = new LadderAndSnake(playerNum);
		las.play();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

