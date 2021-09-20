import java.util.ArrayList;
public class Stack {
    static ArrayList<Integer> arrayList = new ArrayList<Integer>();


    private static void push(int x) {
        arrayList.add(0, x);
    }

    private static void pop() {
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
        System.out.println(isEmpty());
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        push(-1);
        push(8);
        pop();
        pop();
        System.out.println(isEmpty());
        System.out.println(peek());
        push(4);
        System.out.println(search(1));
        System.out.println("The size of the stack is: " + getSize());
        printArrayList();

    }
    
}
