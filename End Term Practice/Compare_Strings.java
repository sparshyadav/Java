import java.util.ArrayList;
import java.util.Scanner;

public class Compare_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        String s = sc.next();
        ArrayList<String> st = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String str = arr[i];
            if(str.compareTo(s)>0){
                st.add(str);
            }
        }
        System.out.println(st);

    }
}
