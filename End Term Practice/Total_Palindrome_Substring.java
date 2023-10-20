public class Total_Palindrome_Substring {
    static boolean checkPalindrome(String str) {
        char[] arr = str.toCharArray();
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            if (arr[start] != arr[end]) {
                return false;
            } else if (arr[start] == arr[end]) {
                start++;
                end--;
            }
        }
        return true;
    }

    static int checkSubstring(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                String subStr = str.substring(i, j + 1);
                if (checkPalindrome(subStr)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "abs";

        int ans = checkSubstring(str);
        System.out.println("The Total Number of Palindromic Substrings are: " + ans);
    }
}
