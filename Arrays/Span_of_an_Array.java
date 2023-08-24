import java.util.*;
public class Span_of_an_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        
        int maxi=arr[0];
        int mini=arr[0];
        for(int i=1; i<n; i++){
            if(arr[i]>maxi){
                maxi=arr[i];
            }
            if(arr[i]<mini){
                mini=arr[i];
            }
        }
        int ans=maxi-mini;
        System.out.println(ans);
    }
}
