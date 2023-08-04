
public class Global_Variable{
    static int val=5;
    public static void main(String[] args) {
        System.out.println("Hi");
        System.out.println(val);
        fun1();
        fun2();
    }
    public static void fun2(){
        System.out.println("This is Fun2");
        System.out.println(val);
    }
    public static void fun1(){
        val=11;
        System.out.println("This is Fun1");
        System.out.println(val);
    }
}