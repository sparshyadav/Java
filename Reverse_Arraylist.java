import java.util.*;
import java.util.Collections;
public class Reverse_Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> li=new ArrayList<>();
        li.add(3);
        li.add(9);
        li.add(18);
        li.add(27);
        System.out.println(li);
        int start=0;
        int end=li.size()-1;
        while(start<=end){
            // Integer temp=Integer.valueOf(start);
            int temp=li.get(start);
            li.set(start, li.get(end));
            li.set(end, temp);
            start++;
            end--;
        }
        System.out.println(li);
        Collections.reverse(li);
        System.out.println(li);

    }
}
