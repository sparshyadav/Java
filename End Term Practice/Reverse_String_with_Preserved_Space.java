import java.util.*;

public class Reverse_String_with_Preserved_Space {
    static void reverseArray(String[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static StringBuilder reverseeachString(String str) {
        StringBuilder sb = new StringBuilder(str);
        int start = 0;
        int end = sb.length() - 1;
        while (start <= end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }
        return sb;
    }

    static StringBuilder reverseString(String str) {
        StringBuilder ans = new StringBuilder();
        String[] arr = str.split(" ");
        reverseArray(arr);
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            StringBuilder sb = reverseeachString(s);
            ans.append(sb);
            ans.append(" ");
        }
        return ans;
    }

    public static void main(String[] args) {
        String sample = "Java is Fun!";
        StringBuilder ans = reverseString(sample);
        System.out.println(ans);
    }
}
