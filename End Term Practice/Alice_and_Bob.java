import java.util.*;

public class Alice_and_Bob {
    public static void main(String[] args) {
        int[] alice = { 100, 200, 300 };
        int[] bob = { 300, 200, 100 };

        int count = 0;

        for (int i = 0; i < alice.length; i++) {
            if (alice[i] * 2 > bob[i] && bob[i] * 2 > alice[i]) {
                count++;
            }
        }

        System.out.println("The Total Number of Days when both are Happy are: " + count);
    }
}
