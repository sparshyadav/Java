import java.util.*;

public class Find_Element_in_an_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int data = sc.nextInt();

        int ans = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == data) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
