public class Mergesort {

    public static void mergeSort(int[] array, int start, int end) {

        if (start < end) {

            int mid = (start+end)/2;
            mergeSort(array, start, mid);
            mergeSort(array, mid+1, end);
            int[] low = splitArray(array, start, mid);
            int[] high = splitArray(array, mid+1, end);
            int[] merged = merge(low, high);

        }

        //printArray(merged);



       

    }


    private static int[] merge(int[] arr1, int[] arr2) { //merges two sorted arrays into one sorted array

        int j=0;
        int i=0;
        int[] sorted = new int[arr1.length + arr2.length];
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                System.out.println("Here, i is:" + i);
                sorted[i+j] = arr1[i];
                i++;
            }

            else if (arr1[i] > arr2[j]) {
                
                sorted[i+j] = arr2[j];
                j++;
            }

        }

        if (i < arr1.length) {
            System.out.println("Over Here");
            fillArray(sorted, arr1, i, i+j);
        }

        else if (j < arr2.length) {
            System.out.println("No Over Here");
            fillArray(sorted, arr2, j, j+i);
        }

        return sorted;

    }

    private static void fillArray(int[] dest, int[] array, int count, int startPos) { //fill in rest of finalized array

        for (int i=startPos; i<dest.length; i++) {
            dest[i] = array[count];
            count++;
        }

    }

    private static int[] splitArray(int[] array, int low, int high) {
        int[] split = new int[(low+high)/2];
        int count = 0;
        for (int i=low; i<high; i++) {
            split[count] = array[i];
            count++;
        }

        return split;
    }

    private static void printArray(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        int[] old_array = {3, 4, 5};
        
        fillArray(array, old_array, 1,  3);

        printArray(array);

        int[] arr1 = {1,2,5,8,9,10,11,12,13,14};
        int[] arr2 = {17,22,25,29};

        int[] sorted = merge(arr1, arr2);
        printArray(sorted);

        int[] unsorted = {4, 1, 8, 3, 9, 87, 2};

        System.out.println("The unsorted array is: ");
        printArray(unsorted);

        mergeSort(unsorted, 0, unsorted.length);

        System.out.println("The sorted array is: ");
        printArray(unsorted);

    }
    
}
