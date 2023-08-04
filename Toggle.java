
import java.util.*;

public class Toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)>'a' && str.charAt(i)<'z'){
                str.setCharAt(i, (char)(str.charAt(i)-32));
            }
            else{
                str.setCharAt(i, (char)(str.charAt(i)+32));
            }
        }
        System.out.println(str);
    }
}
