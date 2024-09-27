public class Anagram {
    public static boolean isAnagram(String a, String b) {
        if(a.length() != b.length()) return false;
        int[] visited = new int[26];

        for(int i = 0; i < a.length(); i++) {
            visited[a.charAt(i) - 'a']++;
            visited[b.charAt(i) - 'a']--;
        }

        for(int i = 0; i < 26; i++) {
            if(visited[i] != 0) return false;
        }
        return true;
    }
}
