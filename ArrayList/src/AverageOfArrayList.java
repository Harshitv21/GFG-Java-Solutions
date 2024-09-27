import java.util.ArrayList;

public class AverageOfArrayList {
    public static double posAverage(ArrayList<Integer> numbers) {
        double avg = 0.0;
        int cnt = 0;

        for(Integer it : numbers) {
            if(it >= 0) {
                avg += it;
                cnt++;
            }
        }

        return avg / cnt;
    }
}
