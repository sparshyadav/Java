import java.util.*;

public class Make_Array_Equal {
    static int GCD(int n, int m) {
        if (m == 0) {
            return n;
        }
        return GCD(m, n % m);
    }

    static int arrayGCD(int[] arr) {
        int gcd = arr[0];
        for (int i = 1; i < arr.length; i++) {
            gcd = GCD(gcd, arr[i]);
        }
        return gcd;
    }

    static boolean isEqualArray(int[] arr) {
        int ans = arrayGCD(arr);
        return ans != 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The Array Can be Equal: " + isEqualArray(arr));
    }
}
