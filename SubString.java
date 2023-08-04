import java.util.*;
public class SubString {
    public static void main(String[] args) {
        String str="abcde";
        System.out.println(str.substring(0, 5));
        System.out.println(str.substring(0));

        String s="Sparsh Yadav";
        for(int i=2; i<7; i++){
            System.out.print(s.substring(i));
        }
    }
}
