import java.util.ArrayList;

public class Text_Search_Program {
    static ArrayList<Integer> count(String text, String str) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            for (int j = i; j < text.length(); j++) {
                String s = str.substring(i, j);
                if (s.equals(str)) {
                    list.add(i);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String text = "abababababab";
        String str = "ab";

        ArrayList<Integer> ans = count(text, str);
        System.out.println(ans);
    }
}
