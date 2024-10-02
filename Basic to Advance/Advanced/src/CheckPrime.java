import java.math.BigInteger;

public class CheckPrime {
    public static boolean prime(int n) {
        if(n == 0) return false;

        boolean res;
        BigInteger N = BigInteger.valueOf(n);
        res = N.isProbablePrime(n);

        return res;
    }
}
