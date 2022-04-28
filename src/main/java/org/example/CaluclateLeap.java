package org.example;

import java.util.Scanner;

public class CaluclateLeap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Integer num = sc.nextInt();
        if (sc.hasNextInt()) {
            int row_num = chk0(sc.nextInt());
            if (row_num > 0) {
                Integer[] year = new Integer[row_num];
                for (int i = 0; i < row_num; i++) {
                    String str = new String(sc.next());
                    if(str.chars().allMatch(Character::isDigit)) {
                        Integer num = Integer.valueOf(str);
                        if (chk0(num) > 0) year[i] = num;
                    }
                    else{
                        System.out.println("This is not number.");
                        row_num = 0;
                        break;
                    }

                }
                for (int i = 0; i < row_num; i++) {
                    if (chkLeap(year[i])) System.out.println(year[i] + " is a leap year");
                    else System.out.println(year[i] + " is not a leap year");
                }

            } else System.out.println("Row is Zero.");
        } else System.out.println("This is not number.");
    }

    private static boolean chkLeap(int i) {
        if ((i % 400) == 0) return true;
        else if ((i % 100) == 0) return false;
        else if ((i % 4) == 0) return true;
        else return false;
    }

    private static Integer chk0(Integer i) {
        if(i > 0 )return i;
        else return -1;
    }

}