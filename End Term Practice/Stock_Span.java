import java.util.*;
public class Stock_Span {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> li=new ArrayList<>();
        li.add(1);
        int count=2;
        for(int i=0; i<n; i++){
            if(arr[i]<arr[i+1]){
                li.add(count);
                count++;
            }
            else{
                li.add(1);
            }
        }
        System.out.println(li);
    }
}
