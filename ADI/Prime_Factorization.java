import java.util.*;

public class Prime_Factorization {
    static ArrayList<Integer> primeFactors(int n) {
        ArrayList<Integer> factors = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
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
