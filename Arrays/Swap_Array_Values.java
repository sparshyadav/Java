import java.util.*;
public class Swap_Array_Values {
    static void print(int arr[], int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Values in the Array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the Index you want to Swap: ");
        int i=sc.nextInt();
        int j=sc.nextInt();

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

        print(arr, n);
    }
}
