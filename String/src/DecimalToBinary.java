public class DecimalToBinary {
    public static void toBinary(String N) {
        int num = Integer.parseInt(N);
        String res = "";

        while(num > 0) {
            res += (num % 2) + "";
            num /= 2;
        }

        StringBuilder newRes = new StringBuilder(res);
        System.out.print(newRes.reverse());
    }
}
