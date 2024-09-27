import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOperations {
    public static void add_to_ArrayList(ArrayList<Integer> A, int x) {
        A.add(x);
    }

    public static void sort_ArrayList_Asc(ArrayList<Integer> A) {
        Collections.sort(A);
    }

    public static void reverse_ArrayList(ArrayList<Integer> A) {
        Collections.reverse(A);
    }

    public static int size_Of_ArrayList(ArrayList<Integer> A) {
        int sizeOfA = A.size();
        return sizeOfA;
    }

    public static void sort_ArrayList_Desc(ArrayList<Integer> A) {
        Collections.sort(A, Collections.reverseOrder());
    }

    public static void print_ArrayList(ArrayList<Integer> A) {
        for(Integer it : A) {
            System.out.print(it + " ");
        }
    }
}
