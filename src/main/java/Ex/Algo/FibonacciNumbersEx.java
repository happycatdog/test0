package Ex.Algo;

public class FibonacciNumbersEx {
    public static void main(String[] args){
        int[] r = new int[10];
        for(int i=0; i<10; i++){
            fibonacciNumbers(i, r);
            System.out.println(r[i]);
        }
    }

    static int fibonacciNumbers(int n, int[] r){
        if(n <= 0) return 0;
        else if(n == 1) return r[n] = 1;
        else if(r[n] > 0) return r[n];
        return r[n] = fibonacciNumbers(n-1, r) + fibonacciNumbers(n-2, r);
    }
}
