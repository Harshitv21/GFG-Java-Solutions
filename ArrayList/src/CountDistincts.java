import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountDistincts {
    public static int countDistinct(ArrayList<Integer> numbers){
        Map<Integer, Integer> map = new HashMap<>();

        for (int number : numbers) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }

        return map.size();
    }
}
