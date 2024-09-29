public class PanagramCheck {
    public static boolean isPanagram(String str) {
        boolean[] visited = new boolean[26];
        int n = str.length();

        if(n >= 27) {
            for(int i = 0; i < str.length(); i++) {
                char curr = str.charAt(i);
                if((int)curr < 97) {
                    visited[curr - 'A'] = true;
                } else {
                    visited[curr - 'a'] = true;
                }
            }
            for(boolean val : visited) {
                if(val == false) {
                    return false;
                }
            }
            return true;
        }

        return false;
    }
}
