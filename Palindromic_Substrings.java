
import java.util.*;

public class Palindromic_Substrings {
    public boolean palindrome(String s){
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<str.length(); j++){
                String substring=str.substring(i, j);
                String revString=substring.reverse();
            }
        }

    }
}
