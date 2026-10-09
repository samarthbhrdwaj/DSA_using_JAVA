package JAVA_16_Queue;
import java.util.*;
public class JAVA_02_Traverse {
    static void print(Queue q){
        int n = q.size();
        for(int i=0; i<n; i++){
            System.out.print(q.peek()+" ");
            q.add(q.remove());
        }
        System.out.println();
    }
    static void main() {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        print(q);
    }
}