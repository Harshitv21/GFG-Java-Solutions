public class ForLoop_2 {
    public static void utility(String s) {
        // Length of string is given by s.length()
        // character at any index i is given by s.charAt(i)
        for(int i = 0; i < s.length(); i++) {
            if(i % 2 == 0) {
                System.out.print(s.charAt(i));
            }
        }
    }
}
