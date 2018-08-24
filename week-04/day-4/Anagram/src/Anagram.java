public class Anagram {
    public static void main(String[] args) {
        String word1 = "listen";
        String word2 = "silent";
        System.out.println(areAnagrams(word1, word2));
    }

    public static boolean areAnagrams(String s1, String s2) {
        String checker1;
        String checker2;
        int controlNr = 0;
        if (s1.length() != s2.length()) {
            return false;
        } else {
            for (int i = 0; i < s1.length(); i++) {
                for (int j = 0; j < s2.length(); j++) {
                    if (s1.charAt(i) == s2.charAt(j)) {
                        controlNr++;
                    }
                }
            }
            if (controlNr != s1.length()) {
                return false;
            } else {
                return true;
            }
        }
    }
}
