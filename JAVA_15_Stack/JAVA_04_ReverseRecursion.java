package JAVA_15_Stack;
import java.util.Stack;
public class JAVA_04_ReverseRecursion {
    static void insertAtBottom(Stack<Integer> st, int ele){
        if(st.isEmpty()){
            st.push(ele);
            return;
        }
        int top = st.peek();
        st.pop();
        insertAtBottom(st, ele);
        st.push(top);
    }
    static void reverse(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int top = st.pop();
        reverse(st);
        insertAtBottom(st, top);
    }
    static void main() {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
}