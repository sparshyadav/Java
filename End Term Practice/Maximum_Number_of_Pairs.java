import java.util.*;

public class Maximum_Number_of_Pairs {
    static int numberOfPairs(int[] arr) {
        int pairs = 0;
        for (int i = 0; i < arr.length; i++) {
            pairs += arr[i] / 2;
        }
        return pairs;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The Total Number of Pairs are: " + numberOfPairs(arr));
    }
}