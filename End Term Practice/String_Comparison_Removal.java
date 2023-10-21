import java.util.*;

public class String_Comparison_Removal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Nodes in LinkedList: ");
        int n = sc.nextInt();

        LinkedList<String> ll = new LinkedList<>();
        System.out.println("Enter The Node Values: ");
        for (int i = 0; i < n; i++) {
            String element = sc.next();
            ll.add(element);
        }

        System.out.println("Enter the String You want to Compare with: ");
        String str = sc.next();
        LinkedList<String> ans = new LinkedList<>();

        for (String s : ll) {
            if (s.compareTo(str) > 0) {
                ans.add(s);
            }
        }
        System.out.println(ans);
    }
}
