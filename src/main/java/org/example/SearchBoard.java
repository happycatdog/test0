package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SearchBoard {

    private static List<Integer> result;
    private static char[][] yxchar;
    private static char[] resultChar;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inData = sc.nextLine();
        String[] rowcolcnt = inData.split(" ");
        result = Arrays.stream(rowcolcnt)
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());

        if (chkRowColRange() && chrRowColResultRange()){
            try{
                makeCharArray(sc);

                makeResultCharArray(sc);

                for (int i =0; i<result.get(2);i++){
                    System.out.println(resultChar[i]);
                }
            }catch (Exception e){
                System.out.println("Error ::"+e.getMessage());
                e.printStackTrace();
            }finally {
                if (sc!= null)
                    sc.close();
            }

        }
        else {
            System.out.println("Out of Range Array");
            //sc.close();
        }
        sc.close();
    }

    private static boolean chrRowColResultRange() {
        return result.get(2) >= 1 && result.get(2) <= result.get(0) * result.get(1);
    }

    private static boolean chkRowColRange() {
        return result.get(0) >= 1 && result.get(1) <= 20;
    }

    private static void makeCharArray(Scanner sc){
        yxchar = new char[result.get(0)][result.get(1)];

        for (int i =0; i<result.get(0);i++){
            String inData = sc.nextLine();
            for(int j=0; j<result.get(1);j++){
                yxchar[i][j] = inData.charAt(j);
            }
        }

    }

    private static void makeResultCharArray(Scanner sc){

        resultChar = new char[result.get(2)];
        for(int i=0; i<result.get(2); i++){
            String inData = sc.nextLine();
            String[] rowcol = inData.split(" ");
            Integer row = Integer.parseInt(rowcol[0]);
            Integer col = Integer.parseInt(rowcol[1]);
            makeResultCharArrayRange(row, col);
            resultChar[i] = yxchar[row][col];
        }
    }
    private static void makeResultCharArrayRange(Integer row, Integer col) {
        if ((0 <= row && row < result.get(0) ) && (0 <= col && col < result.get(1) )) {}
        else throw new IndexOutOfBoundsException();
    }

}
