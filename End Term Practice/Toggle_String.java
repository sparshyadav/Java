import java.util.*;

public class Toggle_String {
    static String toggleString(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 65 && ch <= 91) {
                ch += 32;
            } else if (ch >= 97 && ch <= 123) {
                ch -= 32;
            }
            s += ch;
        }
        return s;
    }

    public static void main(String[] args) {
        String str = "ABcdEf";
        String ans = toggleString(str);
        System.out.println("Before Toggle: " + str);
        System.out.println("After Toggle: " + ans);
    }
}
