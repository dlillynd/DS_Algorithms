public class Selectionsort {

    public static void selectionSort(int[] array) {
        for (int i=0; i<array.length; i++) {
            for (int j=i; j<array.length; j++) {
                if (array[i] > array[j]) {
                    //printArray(array);
                    swap(array, i, j);
                }
            }
        }
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

        int[] array = {4, 6, 99, 4, 2};
        printArray(array);
        selectionSort(array);
        printArray(array);

    }
    
}
