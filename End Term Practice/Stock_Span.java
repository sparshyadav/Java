import java.util.*;

public class Stock_Span {
    static int[] stockSpan(int[] arr) {
        Stack<Integer> st = new Stack<>();

        int[] ans = new int[arr.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = 1;
        }

        for (int i = 0; i < arr.length; i++) {
            while (!st.empty() && arr[st.peek()] < arr[i]) {
                st.pop();
            }
            if (!st.empty() && arr[st.peek()] > arr[i]) {
                ans[i] = i - st.peek();
            } else if (st.empty()) {
                ans[i] = i + 1;
            }
            st.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 30, 35, 40, 38, 35 };

        int[] ans = stockSpan(arr);

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i] + " ");
        }
    }
}
