package Ex.Algo;

public class QuickSortEx {
    static void quickSort(int[] array){
        quickSort(array, 0, array.length - 1);
    }
    static void quickSort(int[] array, int start, int end){
        int part2 = partition(array, start, end);
        if(start < part2 - 1){
            quickSort(array, start, part2 - 1);
        }
        if(part2 < end){
            quickSort(array, part2, end);
        }
    }

    static int partition(int[] array, int start, int end){
        int pivot = array[(start + end) / 2];
        while(start <= end){
            while (array[start] < pivot) start++;
            while (array[end] > pivot) end--;
            if(start <= end){
                swap(array,start,end);
                start++;
                end--;
            }
        }
        return start;
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

    public static void main(String[] args){
        int[] array = {3,9,4,7,5,0,1,6,8,2};
        printArray(array);
        quickSort(array);
        printArray(array);
    }
}
