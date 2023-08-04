public class TypeConversion {
    public static void main(String[] args) {
        byte b=125;
        int a=b;
        System.out.println(a);  
        
        a=257;
        byte k=(byte)a;
        System.out.println(k);

        float f=5.6f;
        int t=(int) f;
        System.out.println(t);

        byte x=10;
        byte y=30;
        int result=x*y;
        System.out.println(result);
    }
}
