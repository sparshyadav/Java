import java.util.*;
import java.util.LinkedList;

// import LinkedList.linkedlist;
public class LinkedList_Collection_Framework {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(1, 40);

        LinkedList<Integer> llCopy=new LinkedList<>();
        llCopy=(LinkedList) ll.clone();
        llCopy.addFirst(50);
        llCopy.addLast(100);

        System.out.println(ll);
        System.out.println(llCopy);

        System.out.println(ll.contains(80));
        System.out.println(llCopy.indexOf(100));
    }
}
