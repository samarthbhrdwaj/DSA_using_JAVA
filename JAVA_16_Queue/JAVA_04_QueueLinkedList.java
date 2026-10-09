package JAVA_16_Queue;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
        next = null;
    }
}
class Queues{
    Node front;
    Node rear;
    int len;
    void add(int n){
        Node temp = new Node(n);
        if(front == null) front = rear = temp;
        else{
            rear.next = temp;
            rear = temp;
        }
        len++;
    }
    void remove(){
        if(front == null) {
            System.out.println("Queue is already Empty");
            return;
        }
        else if(front.next == null) front = rear = null;
        else front = front.next;
        len--;
    }
    int peek(){
        if(front == null) return -1;
        return front.val;
    }
    void print(){
        Node temp = front;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    int size(){
        return len;
    }
}
public class JAVA_04_QueueLinkedList {
    static void main() {
        Queues q = new Queues();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.print();
        q.remove();
        q.print();
        System.out.println(q.peek());
        System.out.println(q.size());
    }
}
