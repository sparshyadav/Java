import java.util.*;
public class Funny_Digits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int ans=0;
        for(int i=n-1; i>0; i--){
            int number=i;
            while(number!=0){
                int num1=number%10;
                number/=10;
                int num2=number%10;
                number/=10;
                if(num1>num2){
                    ans=number;
                }
            }
        }
        System.out.println("The Number is: "+ans);
    }
}
