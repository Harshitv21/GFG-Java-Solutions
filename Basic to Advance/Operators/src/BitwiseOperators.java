public class BitwiseOperators {
    public static void utility(int a, int b, int c) {
        int d = a ^ a;
        int e = c ^ b;
        int f = a & b;
        int g = c | (a ^ a);
        e = ~e;

        System.out.println(d + " " + e + " " + f + " " + g);
    }
}
