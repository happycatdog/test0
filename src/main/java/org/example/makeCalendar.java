package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

enum Days{
    THURSDAY,FRIDAY,SATURDAY,SUNDAY,MONDAY,TUESDAY,WEDNESDAY
}
public class makeCalendar {

    private static List<Long> result;

    final static long YEAR_MAX = 100000000000L;
    public static void main(String[] args) throws Exception{

        try (Scanner sc = new Scanner(System.in)){
            String inData = sc.nextLine();
            String[]ymd = inData.split(" ");
            result = Arrays.stream(ymd)
                            .mapToLong(Long::parseLong)
                            .boxed()
                            .collect(Collectors.toList());


            if(chkYear()){

                if(chkMonth()){

                    Boolean result_chk;
                    if(chkLeap(result.get(0)) && result.get(1) == 12) result_chk = chkDayLeap();
                    else result_chk = chkDayNotLeap();

                    if(result_chk = true){
                        Long resultDay = 360*result.get(0) + (result.get(0)/4) - (result.get(0)/100)
                                + (result.get(0)/400) + 30*(result.get(1)-1) + result.get(2) - 1;

                        System.out.println(resultDay);
                        System.out.println(Days.values()[(int)((resultDay) %7)]);
                        System.out.println(Days.values()[Math.toIntExact((resultDay) %7)]);

                        System.out.println();

                    }
                }
            }

        }


    }

    private static boolean chkDayLeap() {
        if (1 <= result.get(2) && result.get(2) <= 31) { return true;}
        else {
            System.out.println("day is Wrong");
            return false;
        }
    }

    private static boolean chkYear() {
        if (0 <= result.get(0) && result.get(0) <= YEAR_MAX) { return true;}
        else {
            System.out.println("Year is Wrong");
            return false;
        }
    }

    private static boolean chkMonth() {
        if (1 <= result.get(1) && result.get(1) <= 12) { return true;}
        else {
            System.out.println("month is Wrong");
            return false;
        }
    }

    private static boolean chkDayNotLeap() {
        if (1 <= result.get(2) && result.get(2) <= 30) { return true;}
        else {
            System.out.println("day is Wrong");
            return false;
        }
    }

    private static boolean chkLeap(long i) {
//        Long i = result.get(0);
        if ((i % 400) == 0) return true;
        else if ((i % 100) == 0) return false;
        else if ((i % 4) == 0) return true;
        else return false;
    }
}
