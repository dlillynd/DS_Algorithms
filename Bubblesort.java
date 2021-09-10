public class Bubblesort {

    public static void bubbleSort(int[] array) {
        for (int i=0; i<array.length; i++) {
            for (int j=1; j<array.length-i; j++) {
                if (array[j-1] > array[j]) {
                    swap(array, j-1, j);
                    printArray(array);
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

        int[] array = {5,3,8,4,6,-4,0,56,32,555,6};
        printArray(array);
        bubbleSort(array);
        printArray(array);

    }
    
}
