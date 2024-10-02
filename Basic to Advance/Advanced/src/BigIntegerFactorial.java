import java.math.BigInteger;

public class BigIntegerFactorial {
    public static BigInteger factorial(int x) {
        BigInteger f = new BigInteger("1"); // Or BigInteger.ONE

        if(x == 1) return BigInteger.ONE;

        for (int i = 2; i <= x; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }
}
