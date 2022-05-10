package Ex.Condition;

import java.util.Scanner;

public class CaseEx {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.println("Season is ....\nwhat's season: ");
        int month = stdIn.nextInt();
        String season = switch(month){
            case 3, 4, 5   -> "SPRING";
            case 6, 7, 8   -> "SUMMER";
            case 9, 10, 11 -> "FALL";
            case 12, 1, 2  -> "WINTER";
            default        -> "NOTHING";
        };
        System.out.println("Season is " + season + ". ");
    }
}
