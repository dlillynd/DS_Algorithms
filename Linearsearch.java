public class Linearsearch {

    public static int linearSearch(int[] array, int key) {

        for (int i=0; i<array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1; //if the number isn't found
    }



    public static void main(String[] args) {
        int[] array = {3,8,1,9,77,43,98,56,0};
        int p = linearSearch(array, 56);
        if (p==-1) {
            System.out.println("The number was not found");
        }
        else {
            System.out.println("The Linear Search method returned: " + p);
        }
        

    }
        
}