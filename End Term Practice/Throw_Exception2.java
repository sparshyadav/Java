import java.util.*;

public class Throw_Exception2 {
    static void sum(int[] arr) throws Exception {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans += arr[i];
        }
        if (ans <= 100) {
            System.out.println("The Sum is: " + ans);
        } else {
            throw new Exception("Sum Limit Exceeded");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 10, 50, 80 };

        try {
            sum(arr1);
            sum(arr2);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
