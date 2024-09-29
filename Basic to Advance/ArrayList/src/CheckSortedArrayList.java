import java.util.ArrayList;

public class CheckSortedArrayList {
    public static boolean isSorted(ArrayList<Integer> numbers) {
        boolean checkAsc = true, checkDsc = true;
        int j = 1;
        int n = numbers.size();
        for(int i = 0; i < n; i++) {
            if(j < n) {
                int a = numbers.get(i);
                int b = numbers.get(j);
                if(b - a < 0) {
                    checkAsc = false;
                    break;
                }
                j++;
            }
        }

        n = numbers.size() - 1;
        j = n - 1;
        for(int i = n; i >= 0; i--) {
            if(j >= 0) {
                int a = numbers.get(i);
                int b = numbers.get(j);
                if(b - a < 0) {
                    checkDsc = false;
                    break;
                }
                j--;
            }
        }

        if(checkAsc || checkDsc) return true;
        else return false;
    }
}
