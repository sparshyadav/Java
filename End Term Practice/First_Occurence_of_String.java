import java.util.*;

public class First_Occurence_of_String {
    static int firstOccurence(String str, String s) {
        int index = -1;
        if (str.contains(s)) {
            for (int i = 0; i < str.length(); i++) {
                for (int j = i; j < str.length(); j++) {
                    String dummy = str.substring(i, j);
                    if (dummy.equals(s)) {
                        return i;
                    }
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        String str = "verysadbutnotsosad";
        String s = "sad";
        int ans = firstOccurence(str, s);
        System.out.println("The First Occurence of String s in String str begins from index: " + ans);
    }
}
