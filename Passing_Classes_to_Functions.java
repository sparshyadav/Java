
import java.util.*;

public class Passing_Classes_to_Functions {
    public static void fun(Student x){
        System.out.println(x.name);
    }
    public static class Student{
        String name;
    };
    public static void main(String[] args) {
        Student x=new Student();
        x.name="Sparsh";
        fun(x);
    }
}
