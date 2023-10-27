import java.util.*;

public class Grading_Students {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Total Number of Students: ");
        int n = sc.nextInt();

        System.out.println("Enter Their Marks: ");
        char[][] arr = new char[n][10];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = sc.next().charAt(0);
            }
        }

        char[] keys = { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D' };
        ArrayList<Integer> marks = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int total = 0;
            for (int j = 0; j < 10; j++) {
                if (arr[i][j] == keys[j]) {
                    total++;
                }
            }
            marks.add(total);
        }

        System.out.println(marks);
    }
}
