public class Longest_String_Length {
    static int longestString(String str) {
        String[] words = str.split(" ");
        int maxLen = 0;

        for (int i = 0; i < words.length; i++) {
            String s = words[i];
            int count = s.length();
            maxLen = Math.max(count, maxLen);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String str = "My Name is Sparsh Yadav";

        System.out.println("The Maximum Length of String is: " + longestString(str));
    }
}
