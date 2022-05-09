package Ex.Condition;

import java.util.Scanner;

public class BreakEx {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.println("0 Or 1");

        if (stdIn.nextInt() == 0) breakTest(stdIn);
        else continueTest(stdIn);
    }

    private static void continueTest(Scanner stdIn) {
        System.out.println("Calculate Numbers");
        int total = 0;

        outer:
        for(int i=0; i<=10; i++){
            System.out.println(i + "GROUP");
            for(int j=0; j<5; j++){
                System.out.println("Number:");
                int k = stdIn.nextInt();
                if(k == 99999)
                    break outer;
                else if (k == 88888)
                    continue outer;
                total += k;
            }
        }
        System.out.println("Total:" + total);
    }

    private static void breakTest(Scanner stdIn) {
        System.out.println("Calculate Numbers");
        int total = 0;

        outer:
            for(int i=0; i<=10; i++){
                System.out.println(i + "GROUP");
                int sum = 0;
            inner:
                for(int j=0; j<5; j++){
                    System.out.println("Number:");
                    int k = stdIn.nextInt();
                    if(k == 99999)
                        break outer;
                    else if (k == 88888)
                        break inner;
                    sum += k;
                }
            System.out.println("SUM : " + sum);
            total += sum;
            }
        System.out.println("Total:" + total);
    }
}
