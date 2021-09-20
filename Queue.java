import java.util.ArrayList;
public class Queue {
    static ArrayList<Integer> arrayList = new ArrayList<Integer>();

    private static void add(int x) {
        arrayList.add(x);
    }

    private static void remove() {
        arrayList.remove(0);
    }


    private static int getSize() {
        return arrayList.size();
    }

    private static int peek() {
        return arrayList.get(0);
    }

    private static boolean isEmpty() {
        return (arrayList.size() == 0);
    }

    private static void printArrayList() {
        for (int i=0; i<arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();
    }

    private static int search(int x) {
        for (int i=0; i<arrayList.size(); i++) {
            if (arrayList.get(i) == x) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(17);
        arrayList.add(8);
        printArrayList();
        add(7);
        printArrayList();
        remove();
        printArrayList();
        System.out.println(search(17));


    }


    
}
