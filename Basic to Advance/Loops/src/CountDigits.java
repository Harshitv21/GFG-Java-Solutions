public class CountDigits {
    public static void countDigits(int n) {
        int digits = 0;
        while(n > 0) {
            n /= 10;
            digits++;
        }
        System.out.print(digits);
    }
}
