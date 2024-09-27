import java.util.ArrayList;

public class ArrayListEvenOdd {
    public static ArrayList<ArrayList<Integer>> evenOdd(ArrayList<Integer> numbers) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> E = new ArrayList<Integer>();
        ArrayList<Integer> O = new ArrayList<Integer>();

        for(Integer it : numbers) {
            if(it % 2 == 0) E.add(it);
            else O.add(it);
        }
        A.add(E);
        A.add(O);

        return A;
    }
}
