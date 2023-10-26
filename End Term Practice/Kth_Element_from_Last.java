import java.util.*;
public class Kth_Element_from_Last {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number of Nodes: ");
        int n=sc.nextInt();

        LinkedList<Integer> ll=new LinkedList<>();
        System.out.println("Enter the Node Values: ");
        for(int i=0; i<n; i++){
            int element=sc.nextInt();
            ll.add(element);
        }

        System.out.println("Enter the Kth Last Element: ");
        int k=sc.nextInt();
    }
}
