import java.util.*;

public class Balanced_Paranthesis {
    static boolean checkBalancedParanthesis(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else if (st.empty() && ch == ')') {
                return false;
            } else {
                st.pop();
            }
        }
        if (!st.empty()) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "(()))";
        String s = "((()()))";
        System.out.println("The given string is balanced or not: " + checkBalancedParanthesis(str));
        System.out.println("The given string is balanced or not: " + checkBalancedParanthesis(s));
    }
}
