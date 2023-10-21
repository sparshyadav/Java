// Write a program in Java to implement an integer array and perform following operations in form of functions one after another in same sequence as Mentioned: 
// 1. Create an integer array having length of five (05) elements. 
// 2. Input all five elements one after another. 
// 3. Find maximum element from the input array. 
// 4. Find minimum element from the input array. 
// 5. Find Subtraction of all elements of the input array consecutively. Subtract first element from second, second element from third and so on. Subtraction starts from index 0 to index 4.  
// a. Raise exception “Subtract is greater than equal to Zero”, if subtraction result is in positive or zero. 
// b. Raise exception “Subtract is less than Zero”, if subtraction result is zero. 
import java.util.*;
public class Throw_Exception {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int[] arr=new int[5];
        for(int i=0; i<5; i++){
            arr[i]=sc.nextInt();
        }

        int maxElement=0;
        for(int i=0; i<arr.length; i++){
            if(maxElement<arr[i]){
                maxElement=arr[i];
            }
        }

        int minElement=0;
        for(int i=0; i<arr.length; i++){
            if(minElement>arr[i]){
                minElement=arr[i];
            }
        }

        int ans=arr[0];
        for(int i=1; i<arr.length; i++){
            ans-=arr[i];
        }
    }
}
