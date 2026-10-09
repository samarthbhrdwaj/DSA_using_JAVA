package JAVA_16_Queue;
import java.util.*;
public class JAVA_01_Basic {
    static void main() {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q);
        q.add(40);
        System.out.println(q.size());
        q.remove();
        System.out.println(q);
        System.out.println(q.peek());
    }
}