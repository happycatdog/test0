package org.example;

import java.util.Arrays;
import java.util.HashMap;

public class ArrayRank {

    public static void main(String[] args){

        calculateRank(new int[] {22, 11, 44, 66, 55});
        calculateRank(new int[] {15, 12, 11, 10, 9});
        calculateRank(new int[] {10, 20, 30, 40, 50});
        calculateRank(new int[] {10, 10, 10, 10, 20});
    }

    private static void calculateRank(int[] ints) {

        System.out.println("Original array: " + Arrays.toString(ints));

        if (ints==null || ints.length==0) return;

        int[] temp = Arrays.copyOfRange(ints, 0, ints.length);
        Arrays.sort(temp);

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int index = 1;
        int prev = temp[0];
        hashMap.put(prev, index);

        for(int i=1; i<ints.length; i++){
            if(prev!=temp[i])
                index++;
            hashMap.put(temp[i], index);
            prev=temp[i];
        }

        for(int i=0; i<ints.length; i++)
            temp[i] = hashMap.get(ints[i]);

        System.out.println("Rank: " + Arrays.toString(temp));
    }
}
