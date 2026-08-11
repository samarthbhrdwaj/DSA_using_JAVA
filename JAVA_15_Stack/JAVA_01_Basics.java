package JAVA_15_Stack;
import java.util.Stack;
public class JAVA_01_Basics {
    static void main() {
        Stack<Integer> st = new Stack<>();
        System.out.println(st);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        st.pop();
        System.out.println(st.peek());
        System.out.println(st.size());
    }
}