package JAVA_14_LinkedList;
class ListNode{
    ListNode prev;
    ListNode next;
    int val;
    ListNode(int val){
        prev = null;
        next = null;
        this.val = val;
    }
}
class DoublyLinkedList{
    ListNode head;
    ListNode tail;
    int size;
    void insertAtHead(int val){
        ListNode temp = new ListNode(val);
        if(head == null) head = tail = temp;
        else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }
    void insertAtTail(int val){
        ListNode temp = new ListNode(val);
        if(head == null) head = tail = temp;
        else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }
    void insert(int idx, int val){
        if(idx<0 || idx>size){
            System.out.println("Invalid Index");
            return;
        }
        if(idx == 0){
            insertAtHead(val);
            return;
        }
        if(idx == size){
            insertAtTail(val);
            return;
        }
        ListNode data = new ListNode(val);
        ListNode temp = head;
        for(int i=0; i<idx-1; i++){
            temp = temp.next;
        }
        data.next = temp.next;
        data.prev = temp;
        temp.next = data;
        data.next.prev = data;
        size++;
    }
    void deleteAtHead(){
        if(size == 0){
            System.out.println("Empty");
            return;
        }
        else if(size == 1) head = tail = null;
        else{
            head = head.next;
            head.prev = null;
        }
        size--;
    }
    void deleteAtTail(){
        if(size == 0){
            System.out.println("Empty");
            return;
        }
        else if(size == 1) head = tail = null;
        else{
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }
    void delete(int idx){
        if(idx<0 || idx>size){
            System.out.println("Invalid Index");
            return;
        }
        if(idx == 0){
            deleteAtHead();
            return;
        }
        if(idx == size){
            deleteAtTail();
            return;
        }
        ListNode temp = head;
        for(int i=0; i<idx-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;
        size--;
    }
    void display(){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void displayReverse(){
        ListNode temp = tail;
        while(temp.prev!=null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        System.out.println();
    }
    int size(){
        return size;
    }
}
public class JAVA_04_DoublyLinkedList {
    static void main() {
        DoublyLinkedList l1 = new DoublyLinkedList();
        l1.insertAtHead(10);
        l1.insertAtHead(20);
        l1.insertAtHead(30);
        l1.insertAtHead(40);
        l1.insertAtHead(50);
        l1.insertAtTail(100);
        l1.insertAtTail(200);
        l1.insertAtTail(300);
        l1.insertAtTail(400);
        l1.insertAtTail(500);
        l1.display();
        l1.displayReverse();
        int length = l1.size();
        System.out.println(length);
        l1.deleteAtHead();
        l1.deleteAtTail();
        l1.display();
        l1.insert(3, 69);
        l1.display();
        l1.delete(6);
        l1.display();
    }
}
