public class Quicksort {
    public static void quickSort(int[] array, int low, int high) {
        //quickSort(array, 0, array.length-1);
        if (low <= high) {
            int p = partition(array, low, high);
            quickSort(array, low, high-1);
            quickSort(array, low+1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        System.out.println("This is partition");
        while (low <= high) {
            if (array[low] > array[high]) { //needs to be swapped
                swap(array, low, high);
                low++;
                continue; //move the left pointer up
            }
            high--; //no need to swap, check for another match

        }
        return low;
    }

    private static void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

    private static void printArray(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] array = {4, 6, 99, 4, 2};
        printArray(array);
        quickSort(array, 0, array.length-1);
        printArray(array);
    }
}