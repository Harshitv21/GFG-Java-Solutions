public class FindExtraCharacter {
    public static char extraChar(String s1, String s2) {
        int res = 0;

        for(int i = 0; i < s1.length(); i++) {
            int s1Char = (int)s1.charAt(i);
            int s2Char = (int)s2.charAt(i);

            res = res ^ s1Char ^ s2Char;
        }
        res = res ^ (int)s2.charAt(s2.length() - 1);

        return (char)res;
    }
}
