public class LCM {
    public static int LCM(int a, int b) {
        int max = (a >= b) ? a : b;
        int res = max;

        for(int i = max; i <= a * b; i++) {
            if((i % a == 0) && (i % b == 0)) {
                res = i;
                break;
            }
        }
        return res;
    }
}
