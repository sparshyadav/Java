import java.util.*;
public class Total_Number_of_SetBits_Till_N {
    static int totalSetBits(int n){
        int ans=0;

        for(int i=1; i<=n; i++){
            int num=i;
            while(num>0){
                if((num&1)==1){
                    ans++;
                }
                num=num>>1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();
        System.out.println("The Total Number of SetBits for N is: "+totalSetBits(num));
    }
}
