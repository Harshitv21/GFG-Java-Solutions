import java.util.Arrays;

public class StreamsMax {
    public static int maxUsingStreams(int []arr) {
        return Arrays.stream(arr).max().getAsInt();
    }
}
