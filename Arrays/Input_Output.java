import java.util.*;
public class Input_Output{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Elements in Array: ");
        int n=sc.nextInt();

        System.out.println("Enter the Elements in the Array: ");
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}