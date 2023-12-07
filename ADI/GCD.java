import java.util.*;

public class GCD {
    static int findGCD(int n1, int n2) {
        int ans = 1;

        while (n1 % n2 != 0) {
            int rem = n1 % n2;

            n1 = n2;
            n2 = rem;
        }

        ans = n2;

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The First Number: ");
        int n1 = sc.nextInt();

        System.out.println("Enter The Second Number: ");
        int n2 = sc.nextInt();

        int gcd = findGCD(n1, n2);

        System.out.println(gcd);
    }
}
