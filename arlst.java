import java.util.ArrayList;
public class arlst{
    public static void main(String[] args) {
        ArrayList<Integer> li=new ArrayList<>();
        li.add(5);
        li.add(7);
        li.add(2);
        li.add(4);
        li.add(1);
        System.out.println(li.get(3));
        for(int i=0; i<li.size(); i++){
            System.out.print(li.get(i)+" ");
        }
        System.out.println(li);
        li.add(3, 100);
        System.out.println(li);
        li.set(1, 15);
        System.out.println(li);
        li.remove(3);
        System.out.println(li);
        li.remove(Integer.valueOf(100));
        System.out.println(li);
    }
}