public class CheckPalindrome {
    public static boolean isPalin(String s) {
        int start = 0;
        int end = s.length() - 1;

        s = s.toLowerCase();
        while(start < end) {
            if(s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
