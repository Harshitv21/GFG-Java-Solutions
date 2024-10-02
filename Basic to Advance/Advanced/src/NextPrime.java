import java.math.BigInteger;

public class NextPrime {
    public static int nextPrime(int n) {
        BigInteger F = BigInteger.valueOf(n);
        int I = F.nextProbablePrime().intValue();

        return I;
    }
}
