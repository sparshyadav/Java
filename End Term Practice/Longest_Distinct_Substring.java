import java.util.HashMap;

public class Longest_Distinct_Substring {
    static boolean isDistinct(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                int count = map.get(ch);
                map.put(ch, count + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (int count : map.values()) {
            if (count != 1) {
                return false;
            }
        }
        return true;
    }

    static int longestDistinctSubstring(String str) {
        int maxLen = 0;
        for (int i = 0; i < str.length(); i++) {
            StringBuilder s = new StringBuilder();
            for (int j = i; j < str.length(); j++) {
                char ch = str.charAt(j);
                if (isDistinct(s.toString() + ch)) {
                    s.append(ch);
                    maxLen = Math.max(maxLen, s.length());
                } else {
                    s.delete(s.length() - 1, s.length());
                    break;
                }
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String str = "Chitkara";
        String s = "acfagg";

        System.out.println("Max Length of Distinct SubString in str is: " + longestDistinctSubstring(str));
        System.out.println("Max Length of Distinct SubString in s is: " + longestDistinctSubstring(s));
    }
}
