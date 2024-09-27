public class ReverseString {
    public static String reverseString(String s) {
        String b = "";

        for(int i = s.length() - 1; i >= 0; i--) {
            b += s.charAt(i);
        }
        return b;
    }
}
