import java.util.*;

public class Next_Greater_Element {
    static int[] nextGreaterElement(int[] arr) {
        Stack<Integer> st = new Stack<>();

        int[] ans = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            if (st.empty()) {
                st.push(arr[i]);
                ans[i] = -1;
            } else {
                while (!st.empty() && st.peek() < arr[i]) {
                    st.pop();
                }
                if (!st.empty() && st.peek() > arr[i]) {
                    ans[i] = st.peek();
                }
                st.push(arr[i]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 11, 13, 32, 21, 3, 24, 53 };

        int[] ans = nextGreaterElement(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
