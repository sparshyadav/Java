import java.util.*;

public class Any_Duplicates {
    static boolean anyDuplicates(int[] arr) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int count = map.get(arr[i]);
                map.put(arr[i], count + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        for (int enter : map.values()) {
            if (enter != 1) {
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

        System.out.println(anyDuplicates(arr));
    }
}
