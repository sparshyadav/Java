
import java.util.*;

public class StackBasics{
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        System.out.println(st.isEmpty());
        System.out.println(st);
        st.push(1);
        st.push(34);
        st.push(21);
        st.push(76);
        st.push(99);
        System.out.println(st.isEmpty());  
        System.out.println(st.peek());
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println("Size is: "+st.size());
    }
}