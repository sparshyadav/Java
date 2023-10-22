public class Remove_Spaces {
    public static void main(String[] args) {
        String str = "This is a Sample String";
        String ans = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                continue;
            } else {
                ans += ch;
            }
        }

        System.out.println(ans);
    }
}
