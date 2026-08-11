package JAVA_14_LinkedList;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class Linkedlist{
    Node head;
    Node tail;
    int size = 0;
    void addAtEnd(int x){
        Node temp = new Node(x);
        if(head==null) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void display(){
        if(head==null) return;
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void addAtStart(int x){
        Node temp = new Node(x);
        if(head == null) head = tail = temp;
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void removeFromEnd(){
        if(head==null) return;
        if(head==tail) head = null;
        else{
            Node temp = head;
            for(int i=0; i<size-3; i++){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
        size--;
    }
    void removeFromStart(){
        if(head==null) return;
        if(head == tail) head = tail = null;
        else{
            head = head.next;
        }
        size--;
    }
    boolean search(int x){
        if(head==null) return false;
        Node temp = head;
        while(temp!=null){
            if(temp.val == x){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    void insert(int idx, int val){
        if(idx==size){
            addAtEnd(val);
            return;
        }
        else if(idx >= size || idx < 0){
            System.out.println("Index out of bound");
            return;
        }
        Node temp = head;
        for(int i=0; i<idx-1; i++){
            temp = temp.next;
        }
        Node n = new Node(val);
        n.next = temp.next;
        temp.next = n;
        size++;
    }
    int get(int idx){
        if(head == null || idx >= size || idx < 0) return -1;
        if(head == tail) return head.val;
        Node temp = head;
        for(int i=0; i<idx; i++){
            temp = temp.next;
        }
        return temp.val;
    }
    void delete(int idx){
        if(head == null || idx < 0 || idx >= size){
            System.out.println("Index out of bound");
            return;
        }
        Node temp = head;
        for(int i=0; i<idx-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }
}
public class JAVA_03_Methods {
    static void main() {
        Linkedlist ll = new Linkedlist();
        ll.addAtEnd(10);
        ll.addAtEnd(20);
        ll.addAtEnd(30);
        ll.addAtEnd(40);
        ll.addAtEnd(50);
        ll.addAtStart(0);
        ll.addAtStart(-10);
        ll.addAtStart(-20);
        ll.addAtStart(-30);
        System.out.println(ll.size);
        ll.display();
        ll.removeFromStart();
        ll.display();
        System.out.println(ll.size);
        System.out.println(ll.search(50));
        ll.insert(8, 100);
        ll.display();
        System.out.println(ll.size);
        System.out.println(ll.get(-5));
        ll.delete(3);
        ll.display();
        ll.removeFromEnd();
        ll.display();
        System.out.println(ll.size);
    }
}