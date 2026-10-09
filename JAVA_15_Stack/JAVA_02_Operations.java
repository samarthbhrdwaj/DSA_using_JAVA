package JAVA_15_Stack;
import java.util.Stack;
public class JAVA_02_Operations{
    static void traverseBT(Stack<Integer> st){
        Stack<Integer> st2 = new Stack<>();
        while (!st.isEmpty()) {
            st2.push(st.pop());
        }
        while(!st2.isEmpty()){
            System.out.print(st2.peek()+" ");
            st.push(st2.pop());
        }
        System.out.println();
    }
    static void traverseTB(Stack<Integer> st){
        Stack<Integer> st2 = new Stack<>();
        while (!st.isEmpty()) {
            System.out.print(st.peek()+" ");
            st2.push(st.pop());
        }
        while(!st2.isEmpty()){
            st.push(st2.pop());
        }
        System.out.println();
    }
    static void get(Stack<Integer> st, int idx){
        if(idx<0 || idx>=st.size()){
            System.out.println("Invalid");
            return;
        }
        if(idx==st.size()-1){
            System.out.println(st.peek());
            return;
        }
        Stack<Integer> st2 = new Stack<>();
        int n = st.size();
        for(int i=0; i<n-idx; i++){
            st2.push(st.pop());
        }
        System.out.println(st2.peek());
        while(!st2.isEmpty()){
            st.push(st2.pop());
        }
    }
    static void insertAtTop(Stack<Integer> st, int n){
        st.push(n);
    }
    static void insertAtBottom(Stack<Integer> st, int n){
        Stack<Integer> st2 = new Stack<>();
        while(!st.isEmpty()){
            st2.push(st.pop());
        }
        st.push(n);
        while(!st2.isEmpty()){
            st.push(st2.pop());
        }
    }
    static void insert(Stack<Integer> st, int idx, int n){
        if(idx<0 || idx>st.size()){
            System.out.println("Invalid syntax");
            return;
        }
        if(idx==st.size()){
            insertAtTop(st, n);
            return;
        }
        if(idx==0){
            insertAtBottom(st, n);
            return;
        }
        Stack<Integer> st2 = new Stack<>();
        int size = st.size();
        for(int i=0; i<size-idx; i++){
            st2.push(st.pop());
        }
        st.push(n);
        while(!st2.isEmpty()){
            st.push(st2.pop());
        }
    }
    static void deleteAtTop(Stack<Integer> st){
        st.pop();
    }
    static void deleteAtBottom(Stack<Integer> st){
        Stack<Integer> st2 = new Stack<>();
        while(!st.isEmpty()){
            st2.push(st.pop());
        }
        st2.pop();
        while(!st2.isEmpty()){
            st.push(st2.pop());
        }
    }
    static void delete(Stack<Integer> st, int idx){
        if(idx<0 || idx>=st.size()){
            System.out.println("Invalid");
            return;
        }
        if(idx == 0){
            deleteAtBottom(st);
            return;
        }
        if(idx==st.size()-1){
            deleteAtTop(st);
            return;
        }
        int size = st.size();
        Stack<Integer> st2 = new Stack<>();
        for(int i=0; i<size-idx; i++){
            st2.push(st.pop());
        }
        st.pop();
        while(!st2.isEmpty()){
            st.push(st2.pop());
        }
    }
    static void reverse(Stack<Integer> st){
        Stack<Integer> st2 = new Stack<>();
        Stack<Integer> st3 = new Stack<>();
        while(!st.isEmpty()){
            st2.push(st.pop());
        }
        while(!st2.isEmpty()){
            st3.push(st2.pop());
        }
        while(!st3.isEmpty()){
            st.push(st3.pop());
        }
    }
    static void main() {
        Stack<Integer> st = new Stack<>();
        insertAtTop(st, 10);
        insertAtTop(st, 20);
        insertAtTop(st, 30);
        insertAtTop(st, 40);
        insertAtTop(st, 50);
        traverseBT(st);
        traverseTB(st);
        insertAtTop(st, 100);
        insertAtBottom(st, 10000);
        traverseBT(st);
        insert(st, 2, 69);
        deleteAtTop(st);
        deleteAtBottom(st);
        delete(st, 2);
        traverseBT(st);
        get(st, 2);
        reverse(st);
        traverseBT(st);
    }
}