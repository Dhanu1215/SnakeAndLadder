package com.blp.snakeandladdergame;

/**
 * Snake And Ladder Game Project
 */
public class SnakeAndLadder {
    //Declaring and initializing Variables
    private static int position ;
    private static final int NO_PLAY_POSITION = 0;
    private static final int LADDER = 1;
    private static final int SNAKE = 2;
    private static int counter ;

    public static void main(String[] args) {
        System.out.println("Starting position of the player = " + position);
        SnakeAndLadder game = new SnakeAndLadder();
        game.startGame();
    }
    private void startGame() {
         counter = 0; position = 0;//Game started
        //Use while to iterate the values till end position reaches
        while (position < 100) {
            //Use random function to get dice value
            int dice = rollDice();
            //Use random function to check which case get to the player
            int check = positionLadderSnake();
            switch (check) {
                case NO_PLAY_POSITION:
                    System.out.println("Player got same position");
                    break;
                case LADDER:
                    position = position + dice;
                    System.out.println("Player got ladder and position is = " + position);
                    break;
                case SNAKE:
                    position = position - dice;
                    //Use if function to avoid less than zero position of player
                    if ( position < 0 ) {
                        position = 0;
                        System.out.println("Player got snake and position is = " + position);
                    }
            }
            // Use if function to restrict player to exceed 100
            if ( position > 100 ) {
                position = position - dice;
                System.out.println("Player on the same position = " + position);
            }
            if ( position == 100 ) {
                checkWinner();
            }
        }
        //Display Counter of rolling dice
        System.out.println("Count of rolling dice = " + counter);
    }

    private int rollDice() {
        counter++;
        return (int) (Math.floor(Math.random() * 10) % 6 + 1);
    }

    private int positionLadderSnake() {
        return (int) ((Math.random() * 10) % 3);
    }

    private void checkWinner() {
        if ( counter % 2 == 0 ) {
            System.out.println("Player2 won the game");
        } else {
            System.out.println("Player1 won the game");
        }
    }
}

