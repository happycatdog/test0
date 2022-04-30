package org.example;

import java.util.Random;

public class DiceGame {
    private static Integer sum = 0;
    public static void main(String[] args){
        final Integer COUNT_MAX = 10;
        final Integer DICE_MAX = 6;
        final Integer CHILD_MAX = 5;

        Random rnd = new Random();
        int [][] diceInt = new int[COUNT_MAX][CHILD_MAX];
        rnd.nextInt(6);

        for(int i=0; i<COUNT_MAX;i++){
            for(int j=0; j<CHILD_MAX; j++){

                if(j==0){
                    diceInt[i][j] = rnd.nextInt(6-1 + 1) +1 ;
                    System.out.print((i+1) + ":[ " + diceInt[i][j] + "] Dice: " + diceInt[i][j] + " ");
                }else{
                    int numDice = rnd.nextInt(6-1 + 1) +1;
                    if(diceInt[i][j-1] < numDice){
                        diceInt[i][j] = diceInt[i][j-1];
                    }else{
                        diceInt[i][j] = numDice;
                    }
                    System.out.print((i+1) + ":[ " + diceInt[i][j] + "] Dice: " + numDice  + " ");
                }
            }
            System.out.println("");
            sum += diceInt[i][4];
        }
        System.out.println("SUm :" + sum);

    }
}
