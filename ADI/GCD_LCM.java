import java.util.*;

public class GCD_LCM {
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

    static int findLCM(int n1, int n2) {
        int gcd = findGCD(n1, n2);

        int lcm = (n1 * n2) / gcd;

        return lcm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The First Number: ");
        int n1 = sc.nextInt();

        System.out.println("Enter The Second Number: ");
        int n2 = sc.nextInt();

        int gcd = findGCD(n1, n2);
        int lcm = findLCM(n1, n2);

        System.out.println("GCD - " + gcd);
        System.out.println("LCM - " + lcm);
    }
}
