package Ex.Algo;

public class BubbleSortEx {
    static void bubbleSort(int[] array){
        bubbleSort(array, array.length - 1 );
    }
    static void bubbleSort(int[] array, int last){
        if(last >0){
            for(int i=1; i<=last; i++){
                if(array[i-1] > array[i]){
                    swap(array, i-1, i);
                }
            }
            bubbleSort(array,last-1);
        }
    }
    static void swap(int[] array, int source, int target){
        int temp = array[source];
        array[source] = array[target];
        array[target] = temp;
    }

    static void printArray(int[] array){
        for(int data:array){
            System.out.print(data + ", ");
        }
        System.out.println();
    }
    public static  void main(String[] args) {
        int[] array = {3,5,4,2,1};
        printArray(array);
        bubbleSort(array);
        printArray(array);
    }
}
