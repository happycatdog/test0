package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CalculatorEx {

   private static Integer intNum;

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        //intMultifly(sc);

        //divide2(sc);

        //firstDivideSecond(sc);


        int test = Integer.parseInt("20",5);
        System.out.println(test);
//        int numInt = sc.nextInt();
//        String binaryString = Integer.toBinaryString(numInt);
//        System.out.println(binaryString);


//        int numInt = sc.nextInt();
//        String binaryString = Integer.toBinaryString(numInt);
//        System.out.println(binaryString);

//        Integer intNum = 0;
//
//        String intData = sc.next();
//        char[] charArray = intData.toCharArray();
//
//       // byte[] byteArray = intData.getBytes();
//
//        for(int i=0;i<charArray.length;i++){
//
//            if (Character.isDigit(charArray[i])) {
//                int num = Character.getNumericValue(charArray[i]);
//                intNum += num;
//            }
//            else {
//                System.out.println("This is not digit");
//                intNum = 0;
//                break;
//            }
//
//        }
//        System.out.println(intNum);


//        while(true){
//            if(!Character.isSpaceChar(sc.next())) {
//                Byte byt = sc.nextByte();
//                intNum = +byt.intValue();
//            } else break;
//        }



        sc.close();
    }

    private static void firstDivideSecond(Scanner sc) {
        int firstInt = sc.nextInt();
        int secondInt = sc.nextInt();
        Integer cnt = 0;

        while(secondInt!=0 && (firstInt%secondInt) == 0){
            firstInt = firstInt/secondInt;
            cnt++;
        }
        System.out.println(cnt);
    }

    private static void divide2(Scanner sc) {
        int int2Divide = sc.nextInt();
        Integer cnt = 0;

        while((int2Divide%2) == 0){
            int2Divide = int2Divide/2;
            cnt++;
        }
        System.out.println(cnt);
    }

    private static void intMultifly(Scanner sc) {
        String firstData = sc.nextLine();
        Integer numLength = Integer.parseInt(firstData);
        ArrayList<Integer> intArrayList = new ArrayList<>();
        int i =0;
        while(i++ < numLength){
            int num = sc.nextInt();
            intArrayList.add(num*i);
        }

        Iterator iter = intArrayList.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }


}
