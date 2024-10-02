import java.util.Arrays;

public class StreamsSum {
    public static int sumUsingStreams(int []arr) {
        return Arrays.stream(arr).sum();
    }
}
