package Ex;

import java.util.Scanner;

class Sum{
    static int sum(int a, int b, int... no) {
        int s = a + b;
        for (int j : no) s += j;
        return s;
    }
}
public class VariableArityEx {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("sum(1,2)           = " + Sum.sum(1,2));
        System.out.println("sum(1,2,3)         = " + Sum.sum(1,2,3));
        System.out.println("sum(1,2,3,4,5)     = " + Sum.sum(1,2,3,4,5));

        System.out.println("Array is element number: ");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        for(int i=0; i<num; i++){
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }
        System.out.println("sum(1,3,x) = " + Sum.sum(1,3,x));
    }
}
