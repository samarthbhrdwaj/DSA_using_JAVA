package JAVA_14_LinkedList;
public class JAVA_01_LinkedList {
    static void main() {
        Node a = new Node(10);
        Node b = new Node(20);  a.next = b;
        Node c = new Node(30);  b.next = c;
        Node d = new Node(40);  c.next = d;
        Node e = new Node(50);  d.next = e;
        System.out.println(a.val);
        System.out.println(a.next);
        System.out.println(b);
    }
}
