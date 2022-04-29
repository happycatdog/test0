package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class LoopEx {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> intArray = new ArrayList<Integer>();
        ArrayList<String> strArray = new ArrayList<String>();

        //intInput(sc, intArray);
        //strInput(sc, strArray);
        //oddPrint(sc);

    }

    private static void oddPrint(Scanner sc) {
        String firstData = sc.nextLine();
        Integer numLength = Integer.parseInt(firstData);
        String inData = sc.nextLine();
        String[] secondData = inData.split(" ");
        if(numLength == secondData.length){
            List<Integer> result = Arrays.stream(secondData)
                    .mapToInt(Integer::parseInt)
                    .boxed()
//                    .filter(i ->(i%2)!=0)
//                    .filter(i ->(i%3)==0)
                    .collect(Collectors.toList());

            for(int i = 0;i<result.size();i++){
                if((result.get(i) % 2) == 0 ) System.out.println("even");
                else                          System.out.println("odd");
            }
        }
        else System.out.println("The number is different");
    }

    private static void strInput(Scanner sc, ArrayList<String> strArray) {
        String str;
        do {
            str = sc.next();
            strArray.add(str);
        }while (!str.equals("EOF"));


        for(int i = 0;i<strArray.size();i++){
            System.out.println(strArray.get(i));
        }

    }

    private static void intInput(Scanner sc,ArrayList<Integer> intArray) {

        while(true){
            Integer num = sc.nextInt();
            if(num != -1){
                intArray.add(num);
            }else break;
        }
        //int i = 0;

        for(int i = 0;i<intArray.size();i++){
            System.out.println(intArray.get(i));
        }

//        for(intArray. i:intArray){
//            System.out.println(i);
//        }

        Iterator intiter = intArray.iterator();
        while(intiter.hasNext()){
            System.out.println(intiter.next());
        }

        intArray.forEach((temp) -> {
            System.out.println(temp);
        });
    }
}
