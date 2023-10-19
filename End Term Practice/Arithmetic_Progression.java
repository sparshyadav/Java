import java.util.*;

public class Arithmetic_Progression {
    static boolean checkAP(int[] arr) {
        int ans = arr[1] - arr[0];

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != ans) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Size of Array: ");
        int n = sc.nextInt();

        System.out.println("Enter The Elements of Array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("AP or Not: " + checkAP(arr));
    }
}
