public class Vowels_in_Strings {
    static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        try {
            String str = "Hello World";
            String sx = "1242235aeioU";
            String s = null;

            System.out.println("Number of Vowels in String str is: " + countVowels(str));
            System.out.println("Number of Vowels in String sx is: " + countVowels(sx));
            System.out.println("Number of Vowels in String s is: " + countVowels(s));
        } catch (Exception e) {
            System.out.println("Exception=>" + e.getMessage());
        }
    }
}
