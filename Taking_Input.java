import java.util.*;
public class Taking_Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> li=new ArrayList<>();
        int n=sc.nextInt();
        while(n>0){
            li.add(sc.nextInt());
            n=n-1;
        }
        System.out.println(li);
        
    }
}
