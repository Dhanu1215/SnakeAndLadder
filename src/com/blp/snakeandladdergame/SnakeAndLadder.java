package com.blp.snakeandladdergame;

/**
 * Snake And Ladder Game Project
 */
public class SnakeAndLadder {

    public static void main(String[] args) {
        int position = 0;
        System.out.println("Position of player = " + position);
        int dice = (int) ((Math.random()*10)%7);
        System.out.println("Dice number = " + dice);
    }
}



