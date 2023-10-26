import java.util.*;
public class LCM_of_Two_Numbers {
    static int gcd(int n, int m){
        if(m==0){
            return n;
        }
        return  gcd(m, n%m);
    }
    static int lcm(int n, int m){
        return (n*m)/gcd(n, m);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int num1=sc.nextInt();
        int num2=sc.nextInt();

        System.out.println("The LCM of The Two Numbers is: "+lcm(num1, num2));
    }
}
