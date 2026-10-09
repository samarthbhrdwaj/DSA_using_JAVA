package JAVA_15_Stack;
class Node{
    Node next;
    int val;
    Node(int val){
        this.val = val;
        next = null;
    }
}
class Stack{
    Node head;
    int len;
    int peek() throws Exception{
        if(len==0){
            throw new Exception("Stack खाली है पहले कोई element डालो फिर peek करना");
        }
        return head.val;
    }
    int pop() throws Exception{
        if(len==0){
            throw new Exception("Stack खाली है पहले कोई element डालो फिर pop करना");
        }
        int x = head.val;
        head = head.next;
        len--;
        return x;
    }
    void push(int n){
        Node temp = new Node(n);
        if(len == 0) head = temp;
        else{
            temp.next = head;
            head = temp;
        }
        len++;
    }
    int size(){
        return len;
    }
    void display(){
        Node temp = head;
        while(temp!=null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
        System.out.println();
    }
}
public class JAVA_05_StackLinkedList{
    static void main() throws Exception{
        Stack st = new Stack();
//        st.peek();
//        st.pop();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.display();
        System.out.println(st.peek());
        System.out.println(st.size());
    }
}
