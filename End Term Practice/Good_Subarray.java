import java.util.*;

public class Good_Subarray {
    static boolean checkDistinct(ArrayList<Integer> list, int num) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            if (map.containsKey(list.get(i))) {
                int count = map.get(list.get(i));
                map.put(list.get(i), count + 1);
                // return false;
            } else {
                map.put(list.get(i), 1);
            }
        }

        if (map.size() != num) {
            return false;
        }
        return true;
    }

    static void goodSubarray(int[] arr, int num) {
        int ans = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                list.add(arr[j]);
                if (checkDistinct(list, num)) {
                    ans++;
                    System.out.println(list);
                }
            }
        }
        // return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Pair Number: ");
        int num = sc.nextInt();

        System.out.println("Enter the Number of Elements in the Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the Array Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // System.out.println("The Total Number of Godd Subarray is: " + goodSubarray(arr, num));
        goodSubarray(arr, num);
    }
}
