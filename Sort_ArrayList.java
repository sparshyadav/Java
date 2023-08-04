import java.util.*;
public class Sort_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> li=new ArrayList<>();
        int[] arr={1,2,4,7,6,9,8};
        for(int i=0; i<arr.length; i++){
            li.add(arr[i]);
        }
        System.out.println(li);
        // li.add(7);
        // li.add(2);
        // li.add(6);
        // li.add(5);
        // li.add(4);
        // System.out.println(li);
        // Collections.sort(li);
        // System.out.println(li);
    }
}
