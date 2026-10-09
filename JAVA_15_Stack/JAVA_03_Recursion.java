package JAVA_15_Stack;
import java.util.Stack;
public class JAVA_03_Recursion {
    static void insertAtBottom(Stack<Integer> st, int ele){
        if(st.isEmpty()){
            st.push(ele);
            return;
        }
        int top = st.pop();
        insertAtBottom(st, ele);;
        st.push(top);
    }
    static void main() {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);
        insertAtBottom(st, 50);
        System.out.println(st);
    }
}