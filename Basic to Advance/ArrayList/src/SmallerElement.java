import java.util.ArrayList;

public class SmallerElement {
    public static ArrayList<Integer> getSmaller(int arr[], int x) {
        ArrayList<Integer> A = new ArrayList<Integer>();

        for(Integer it : arr) {
            if(it < x) A.add(it);
        }
        return A;
    }
}
