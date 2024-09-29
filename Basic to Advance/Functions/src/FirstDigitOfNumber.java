public class FirstDigitOfNumber {
    public static int firstDigit(int n) {
        int powerOfTen = (int)Math.log10(n);
        int res = n / (int)Math.pow(10, powerOfTen);

        return res;
    }
}
