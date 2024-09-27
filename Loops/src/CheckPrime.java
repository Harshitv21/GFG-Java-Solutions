public class CheckPrime {
    public static boolean prime(int n) {
        if(n == 1) return false;
        if(n == 2 || n == 3) return true;
        if(n % 2 == 0 || n % 3 == 0) return false;

        int sqrtNum = (int)Math.sqrt(n);

        // skipped 1, 2, 3, 4 start from 5
        for(int i = 5; i <= sqrtNum; i += 6) {
            // check for every other odd number
            if((n % i == 0) || (n % (i + 2)) == 0) return false;
        }
        return true;
    }
}
