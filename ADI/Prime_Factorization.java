import java.util.*;

public class Prime_Factorization {
    static ArrayList<Integer> primeFactors(int n) {
        ArrayList<Integer> factors = new ArrayList<>();

        // Method 1
        // for (int i = 2; i <= n; i++) {
        // while (n % i == 0) {
        // factors.add(i);
        // n /= i;
        // }
        // }

        // Method 2
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }

        if (n != 1) {
            factors.add(n);
        }

        return factors;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A Number: ");
        int n = sc.nextInt();

        ArrayList<Integer> ans = primeFactors(n);

        System.out.print(ans);
    }
}
