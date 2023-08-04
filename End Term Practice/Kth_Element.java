import java.util.*;

public class Kth_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> li = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            li.add(sc.nextInt());
        }
        int k = sc.nextInt();
        System.out.println(li.get(n - k));
    }
}