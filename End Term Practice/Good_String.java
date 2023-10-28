import java.util.*;

public class Good_String {
    static boolean isVowel(Character ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    static int goodString(String str) {
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (isVowel(ch)) {
                count++;
                maxCount = Math.max(count, maxCount);
            } else {
                count = 0;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your String: ");
        String str = sc.next();

        int ans = goodString(str);
        System.out.println("Length of the longest substring containing all vowels: " + ans);
    }
}
