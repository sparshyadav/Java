import java.util.*;
public class Deekap_Roses {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> li=new ArrayList<>();
        for(int i=0; i<n; i++){
            li.add(sc.nextInt());
        }
        int target=sc.nextInt();
        int first=0;
        int last=0;
        int min=Integer.MAX_VALUE;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(li.get(i)+li.get(j)==target || Math.abs(first-last)<min){
                    first=li.get(i);
                    last=li.get(j);
                }
            }
        }
        System.out.println(first+" "+last);
    }
}
