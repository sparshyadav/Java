import java.util.*;

public class RunRate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the Total Number of Runs Scored: ");
            double runs = sc.nextInt();

            System.out.println("Enter the Total Number of Overs Faced: ");
            double overs = sc.nextInt();

            double runRate = runs / overs;
            System.out.println("Run Rate: " + runRate);

        } catch (ArithmeticException | InputMismatchException e) {
            System.out.println("Exception=>" + e.getMessage());
        }
    }
}
