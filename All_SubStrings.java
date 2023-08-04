public class All_SubStrings {
    public static void main(String[] args) {
        String s="abcd";
        int start=0;
        int end=s.length();
        for(int i=start; i<=end; i++){
            for(int j=i+1; j<=end; j++){
                System.out.println(s.substring(i, j));
            }
        }
    }
}
