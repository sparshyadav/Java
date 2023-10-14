import java.util.*;
public class Subsequence{
    static ArrayList<String> allSubsequences(String str, int idx, String output){
        ArrayList<String> ans=new ArrayList<>();
    
        if(idx==str.length()){
            ans.add(output);
            return ans;
        }

        ans.addAll(allSubsequences(str, idx+1, output+str.charAt((idx))));
        ans.addAll(allSubsequences(str, idx+1, output));

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="abcd";
        String output="";
        
        ArrayList<String> result=allSubsequences(str, 0, output);

        System.out.println(result);
    }
}