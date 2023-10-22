import java.util.*;
public class Parenthesis {
    static boolean checkParenthesis(String str){
        Stack<Character> st=new Stack<>();

        char[] arr=str.toCharArray();
        for(int i=0; i<arr.length; i++){
            if(arr[i]=='(' || arr[i]=='{' || arr[i]=='['){
                st.push(arr[i]);
            }
            else if(arr[i]==')' || arr[i]=='}' || arr[i]==']'){
                if(st.empty() || st.peek()!='(' && arr[i]==')' || st.peek()!='{' && arr[i]=='}' || st.peek()!='[' && arr[i]==']'){
                    return false;
                }
                st.pop();
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        String str = "while (i < n) { sum += i; i++; }";
        String s = "if (x > 0 { y = 2x; }";

        System.out.println("The Answer for str is: "+checkParenthesis(str));
        System.out.println("The Answer for s is: "+checkParenthesis(s));
    }
}
