import java.util.*;

public class Productive_Character_Pair {
    static String productiveString(String str) {
        String ans = "";
        char[] arr = str.toCharArray();
        int i = 0;
        while (i < arr.length) {
            if (i + 1 == arr.length || arr[i] > arr[i + 1]) {
                ans += arr[i];
            } else {
                ans += arr[i + 1];
            }
            i += 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String str = sc.next();
        String ans = productiveString(str);

        System.out.println("The Productive String is: " + ans);
    }
}
