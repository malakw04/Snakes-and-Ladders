# Snakes and Ladders 

## Overview
This project implements the **Ladder and Snake** board game in Java. The game is designed for **two players**, who roll a dice to progress from **square 1 to 100**. Players may land on **ladders** to advance or **snakes** to move backward.

## Features
- **Two-player gameplay**
- **Randomized dice rolls** to determine movement
- **Ladders to climb up and snakes to slide down**
- **Ensures fair start by rolling dice to decide who plays first**
- **Game continues until a player reaches square 100**

## File Structure
```
├── LadderAndSnake.java       # Core game logic
├── PlayLadderAndSnake.java   # Main entry point for user interaction
```

## Compilation and Execution
### Compile the Java files
```bash
javac LadderAndSnake.java PlayLadderAndSnake.java
```

### Run the Game
```bash
java PlayLadderAndSnake
```

## Gameplay Instructions
1. The game requires **two players**.
2. The game determines who plays first by rolling dice.
3. Each player takes turns rolling the dice to advance.
4. Landing on a **ladder** moves the player **up** to a higher square.
5. Landing on a **snake** moves the player **down** to a lower square.
6. The first player to reach **square 100** wins the game.

## Example Game Output
```
This game should be played by 2 players.
Enter the number of players: 
2
Now deciding which player will start playing:

Player 1 got a dice value of 5
Player 2 got a dice value of 3
Order of playing: Player 1 then Player 2.

Player 1 is now rolling the dice...
Player 1 got a dice value of 4
Player 1 moved to square 4

Player 2 is now rolling the dice...
Player 2 got a dice value of 6
Player 2 climbed from square 6 to square 14 (ladder!)
```

## Ladders and Snakes Mapping
The board includes these ladders and snakes:
- **Ladders**: Moving up from squares **1→38, 4→14, 9→31, 21→42, 28→83, 51→67, 71→91, 80→100**
- **Snakes**: Moving down from squares **16→6, 48→30, 64→60, 79→19, 93→68, 95→24, 97→76, 98→78**

## Contributions
Feel free to fork the repository and submit pull requests for improvements!



