import java.util.*;
public class Delete_10_or_00 {
    static void deleteString(String str){
        int n=str.length();
        String ans="";
        int i=0;
        while(i<n-1){
            String sub=str.substring(i, i+2);
            if(!sub.equals("10") && !sub.equals("00")){
                ans+=str.charAt(i);
                ans+=str.charAt(i+1);
            }
            i++;
        }
        if(i==n-1){
            ans+=str.charAt(i);
        }
        System.out.println("The String is: "+ans);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str=sc.next();
        deleteString(str);
    }
}
