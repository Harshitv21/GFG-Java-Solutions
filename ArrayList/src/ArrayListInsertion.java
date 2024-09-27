import java.util.ArrayList;

public class ArrayListInsertion {
    public static ArrayList<Integer> fillArrayList(int arr[], int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < n; i++) {
            list.add(arr[i]);
        }

        return list;
    }
}
