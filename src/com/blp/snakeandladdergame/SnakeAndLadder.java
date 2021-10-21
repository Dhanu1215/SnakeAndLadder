package com.blp.snakeandladdergame;

/**
 * Snake And Ladder Game Project
 */
public class SnakeAndLadder {
    //Declaring and initializing Variables
    static int position = 0;
    public static final int SAME_POSITION = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;

    public static void main(String[] args) {
        System.out.println("Starting position of the player = " + position);
        //Use while to iterate the values till end position reaches
        while (position < 100) {
            //Use random function to get dice value
            int dice = (int) (Math.floor(Math.random()*10) %6+1);
            //Use random function to check which case get to the player
            int check = (int) ((Math.random() * 10) % 3);
           switch (check) {
                case SAME_POSITION:
                    System.out.println("Player got same position");
                    break;
                case LADDER:
                    position = position + dice;
                    System.out.println("Player got ladder and position of the player = " + position);
                    break;
                case SNAKE:
                    position = position - dice;
                    //Use if function to avoid less than zero position of player
                    if ( position < 0 ) {
                        position = 0;
                        System.out.println("Player got snake and position of the player = " + position);
                    }
            }
            // Use if function to restrict player to exceed 100
            if ( position > 100 ) {
                position = position - dice;
                System.out.println("Player on the same position = " +position);
            }
        }
    }
}

