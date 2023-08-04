public class StringBuilderDemo2 {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Sparsh");
        System.out.println(str);
        str.reverse();
        System.out.println(str); 
        str.reverse();
        System.out.println(str); 
        str.delete(2, 4);
        System.out.println(str);  
    }
}
