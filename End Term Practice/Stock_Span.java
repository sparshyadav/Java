// import java.util.*;
// public class Stock_Span {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         for(int i=0; i<n; i++){
//             arr[i]=sc.nextInt();
//         }
//         ArrayList<Integer> li=new ArrayList<>();
//         li.add(1);
//         int count=2;
//         for(int i=0; i<n; i++){
//             if(arr[i]<arr[i+1]){
//                 li.add(count);
//                 count++;
//             }
//             else{
//                 li.add(1);
//             }
//         }
//         System.out.println(li);
//     }
// }

import java.util.*;

public class Stock_Span {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][];
        int []arr2 = new int[5];
        for(int i = 0;i<arr.length;i++)
        {
            for (int j = 0; j < arr2.length; j++) {
                arr2[j] = sc.nextInt();
            }
            arr[i] = arr2;
        }
        // Scanner sc = new Scanner(System.in);
        // int[][] arr = new int[5][];
        // int[]arr2=new int[5];
        // for (int i = 0; i < 5; i++) {
        // // int n = sc.nextInt();
        // for (int j = 0; j < arr2.length; j++) {
        // arr2[j] = sc.nextInt();
        // }
        // arr[i]=arr2;
        // }
    }}

    Scanner sc = new Scanner(System.in);
    int[][] arr = new int[5][];
    int []arr2 = new int[5];for(
    int i = 0;i<arr.length;i++)
    {
        for (int j = 0; j < arr2.length; j++) {
            arr2[j] = sc.nextInt();
        }
        arr[i] = arr2;
    }
}

}
