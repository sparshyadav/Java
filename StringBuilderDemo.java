
import java.util.*;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        System.out.println(str); 
        str.append(" World!");
        System.out.println(str); 
        str.setCharAt(0, 'L');
        System.out.println(str); 
        str.insert(2 , 'y'); 
        System.out.println(str);
        str.deleteCharAt(2);
        System.out.println(str);
        str.reverse();
        System.out.println(str);
    }
}
