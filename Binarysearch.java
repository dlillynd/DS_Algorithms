public class Binarysearch {


    public static int binarySearch(int[] array, int key, int low, int high) {
        int mid = (high+low)/2;
        System.out.println("Mid is " + mid);
        if (array[mid] == key) {
            System.out.println("Returning: " + mid);
            return mid;
        }
        else {
            if (array[mid] > key) { //if the key is in lower half of the list

                return binarySearch(array, key, low, mid-1);

            }
            else if (array[mid] < key) { //if the key is in the upper half of the list
                return binarySearch(array, key, mid+1, high); 
            }
        }
        System.out.println("At end");
        return -1; //if key was never found
    }

    private static boolean isSorted(int[] array) {
        for (int i=0; i<array.length-1; i++) {
            if (array[i+1] < array[i]) {
                return false;
            }
        }

        return true;
    }

    private static void printArray(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {4,2,8,5,1,99};
        if (!isSorted(array)) { //if the array is not sorted to begin with
            printArray(array);
            System.out.println("The array is not sorted");
            Quicksort q = new Quicksort();
            q.quickSort(array, 0, array.length-1); //sorting the array for binary search to work
        }
        System.out.println("The array should be sorted");
        printArray(array);

        int p = binarySearch(array, 939, 0, array.length-1);
        if (p== -1) {
            System.out.println("The key was not found");
            return;
        }
        System.out.println("The key was found at position: " + p);
    }
    
}
