public class LastDigitOfANumber {
    public static void utility(int n) {
        int ans = n % 10;
        if(ans < 0) ans *= -1;

        // below statement print the result
        System.out.println(ans);
    }
}
