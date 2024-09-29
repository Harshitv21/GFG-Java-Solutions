public class PrintAlphabets {
    public static void alphabets(char c1, char c2) {
        int a = (int)c1;
        int b = (int)c2;

        for(int i = a; i <= b; i++) {
            System.out.print((char)i + " ");
        }
    }
}
