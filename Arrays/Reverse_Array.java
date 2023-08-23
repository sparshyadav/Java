import java.util.*;

public class Reverse_Array {
    static void reverse(int arr[], int n) {
        int i = 0;
        int j = n - 1;
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        print(arr, n);
    }

    static void print(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Values in the Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the Array Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        reverse(arr, n);
        
    }
}
