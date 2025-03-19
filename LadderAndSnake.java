/**
 * @author Malak Abdelkafy(40235257)
 * COMP 249
 * Assignment 1
 * Due Date: February 6, 2023
 */



/**
 * Part 1
 */

import java.util.Arrays;

public class LadderAndSnake 
{
	
	/**
	 * attributes
	 */
	private int numOfPlayers;
	private int[] position;
	private int[][] board = new int[10][10];
	
	/**
	 * Default Constructor.
	 */
	public LadderAndSnake() {}
	
	/**
	 * Copy constructor which takes another LadderAndSnake object 
	 and copies its attributes.
	 * @param l is a LadderAndSnake object.
	 */
	public LadderAndSnake(LadderAndSnake l) 
	{
		this.numOfPlayers = l.numOfPlayers;
		this.position = l.position;
		this.board = l.board;
	}
	 
	/**
	 * Parameterized constructor which takes an int numOfPlayers 
	 and places inside the positions array.
	 * @param numOfPlayers is an integer.
	 */
	public LadderAndSnake(int numOfPlayers) 
	{
	    this.numOfPlayers = numOfPlayers;
	    position = new int[numOfPlayers];
	}
	
	/**
	 * accessor
	 * @return integer numOfPlayers 
	 */
	public int getNumOfPlayers() 
	{
		return numOfPlayers;
	}
	/**
	 * accesssor
	 * @return array position
	 */
	public int[] getPosition() 
	{
		return position;
	}
	/**
	 * accessor
	 * @return 2-D array board
	 */
	public int[][] getBoard() 
	{
		return board;
	}
	
	/**
	 * mutator
	 * @param int np
	 */
	public void setNumOfPlayers(int np) 
	{
		this.numOfPlayers = np;
	}
		
	/**
	 * mutator
	 * @param int array p
	 */
	public void setPosition(int[] p) 
	{
		this.position = p;
	}
	
	/**
	 * mutator
	 * @param int 2-D array b
	 */
	public void setBoard(int [][] b) 
	{
		this.board = b;
	}
	
	
	

	/**
	 * @return a random integer between 1 and 6 (inclusively)
	 */
	public int flipDice() 
	{
		return (int)(Math.random() * (6) + 1);
	}

	
	/**
	 * @param newSquare
	 * @return the square the player climbed up to or fell down from
	 if they land on a square with a ladder or a snake.
	 */
	private int getNextPosition(int newSquare) 
	{
		if (newSquare > 100) 
        {
            newSquare = 100 - (newSquare - 100);
        }
        if (newSquare == 1) 
        {
            newSquare = 38;
        }
        else if (newSquare == 4) 
        {
            newSquare = 14;
        } 
        else if (newSquare == 9) 
        {
            newSquare = 31;
        } 
        else if (newSquare == 16) 
        {
            newSquare = 6;
        }
        else if (newSquare == 21) 
        {
            newSquare = 42;
        }
        else if (newSquare == 28) 
        {
            newSquare = 83;
        }
        else if (newSquare == 36) 
        {
            newSquare = 44;
        }
        else if (newSquare == 48) 
        {
            newSquare = 30;
        }
        else if (newSquare == 51) 
        {
            newSquare = 67;
        }
        else if (newSquare == 64) 
        {
            newSquare = 60;
        }
        else if (newSquare == 71) 
        {
            newSquare = 91;
        }
        else if (newSquare == 79) 
        {
            newSquare = 19;
        }
        else if (newSquare == 80) 
        {
            newSquare = 100;
        }
        else if (newSquare == 93) 
        {
            newSquare = 68;
        }
        else if (newSquare == 95) 
        {
            newSquare = 24;
        }
        else if (newSquare == 97) 
        {
            newSquare = 76;
        }
        else if (newSquare == 98) 
        {
            newSquare = 78;
        }
        return newSquare;
	}
	
	/**
	 * method that contains the core engine of the game.
	 * first, it flips the dice for both players then compares them
	 to see which player has the greater value and will start first or if there is a tie. 
	 * then, it moves each player to a new square by adding the dice value they get to their current position until 
	 one of them reaches 100 and wins.
	 */
	public void play() 
	{
	    
	    System.out.println("Now deciding which player will start playing:");
	    System.out.println();
	    
	    int winner = -1;
	    
	    while (winner == -1)
	    {
	        int diceValue1 = flipDice();
	        int diceValue2 = flipDice();
	       
	        System.out.println("Player 1 got a dice value of " + diceValue1);
	        System.out.println("Player 2 got a dice value of " + diceValue2);
	        System.out.println();
	       
	        if (diceValue1 == diceValue2) 
	        {
	            System.out.println("A tie was achieved between Player 1 and Player 2. Attempting to break the tie");
	            System.out.println();
	            continue;
	        
	        } 
	        else if (diceValue1 > diceValue2) 
	        {
	            winner = 0;
	            System.out.println("Order of playing: Player  1 then Player 2.");
	    	    System.out.println();
	        } 
	        else 
	        {
	            winner = 1;
	            System.out.println("Order of playing: Player 2 then Player 1");
	    	    System.out.println();
	        }
	    }
	  
	   
	    boolean stillPlaying = true;
	    int currentPlayer = winner;
	    
	    while(stillPlaying) 
	    {
	    	int diceValue = flipDice();
            System.out.println("Player " + (currentPlayer + 1)  + " is now rolling the dice...");
            System.out.println("Player " + (currentPlayer + 1)  + " got a dice value of " + diceValue);
            
            int expectedPosition = position[currentPlayer] + diceValue;
            int newPosition = getNextPosition(expectedPosition);
            position[currentPlayer] = newPosition;
            
           if(expectedPosition < newPosition)
           {
        	   System.out.println("Player " + (currentPlayer + 1) + " climbed from square " + expectedPosition + " to square " + newPosition);
           }
           else if(expectedPosition > newPosition) 
           {
        	   System.out.println("Player " + (currentPlayer + 1) + " fell from square " + expectedPosition + " to square " + newPosition);
           }
           else
        	   System.out.println("Player " + (currentPlayer + 1) + " moved to square " + newPosition);
           
           System.out.println();
           
           if(newPosition == 100) 
            {
            	System.out.println("Player " + (currentPlayer + 1) + " won the game!");
            	stillPlaying = false;
            }
            
           	System.out.println("Net Positions: ");
           	System.out.println(Arrays.toString(position));
           	System.out.println();
           	
            currentPlayer = (currentPlayer + 1) % numOfPlayers;
	    }
	}
}
	
	
	



