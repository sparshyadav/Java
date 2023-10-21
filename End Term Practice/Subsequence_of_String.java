public class Subsequence_of_String {
    static void subsequence(String str, int idx, String output){
        if(idx==str.length()){
            System.out.println(output);
            return;
        }
        subsequence(str, idx+1, output+str.charAt(idx));
        subsequence(str, idx+1, output);
    }
    public static void main(String[] args) {
        String str="abc";
        subsequence(str,0,"");
    }
}
