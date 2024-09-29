public class BinaryToDecimal {
    public int binary_to_decimal(String str) {
        int res = 0;
        int curr = 0;

        for(int i = str.length() - 1; i >= 0; i--) {
            res += (int) (((int)str.charAt(i) - 48) * Math.pow(2, curr));
            curr++;
        }
        return res;
    }
}
