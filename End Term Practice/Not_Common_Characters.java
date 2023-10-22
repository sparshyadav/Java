import java.util.*;

public class Not_Common_Characters {
    static ArrayList<Character> nonCommomCharacters(String str1, String str2) {
        ArrayList<Character> list = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (map.containsKey(ch)) {
                continue;
            } else {
                map.put(ch, 1);
            }
        }

        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            if (map.containsKey(ch)) {
                int count = map.get(ch);
                map.put(ch, count + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                list.add(entry.getKey());
            }
        }

        return list;
    }

    public static void main(String[] args) {
        String str1 = "characters";
        String str2 = "alphabets";

        ArrayList<Character> ans = (nonCommomCharacters(str1, str2));
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i) + " ");
        }
    }
}
