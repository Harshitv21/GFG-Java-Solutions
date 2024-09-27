import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputString {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        /* solution starts here */
        String myInput = read.readLine();
        System.out.println(myInput);
        /* solution ends here */
    }
}
