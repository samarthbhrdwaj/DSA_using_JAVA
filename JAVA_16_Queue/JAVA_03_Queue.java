package JAVA_16_Queue;
import java.util.*;
public class JAVA_03_Queue {
    static void insertAtFront(Queue<Integer> q, int val){
        int n = q.size();
        q.add(val);
        for(int i=0; i<n; i++){
            q.add(q.remove());
        }
    }
    static void insertAtRear(Queue<Integer> q, int val){
        q.add(val);
    }
    static void insert(Queue<Integer> q, int idx, int val){
        if(idx < 0 || idx > q.size()) System.out.println("Index out of Bound");
        else if(idx == 0) insertAtFront(q, val);
        else if(idx == q.size()) insertAtRear(q, val);
        else{
            int n = q.size();
            for(int i=0; i<idx; i++){
                q.add(q.remove());
            }
            q.add(val);
            for(int i=idx; i<n; i++){
                q.add(q.remove());
            }
        }
    }
    static void deleteAtFront(Queue<Integer> q){
        q.remove();
    }
    static void deleteAtRear(Queue<Integer> q){
        int n = q.size();
        for(int i=0; i<n-1; i++){
            q.add(q.remove());
        }
        q.remove();
    }
    static void delete(Queue<Integer> q, int idx){
        if(idx < 0 || idx >= q.size()) System.out.println("Index out of Bound");
        else if(idx == 0) deleteAtFront(q);
        else if(idx == q.size()-1) deleteAtRear(q);
        else{
            int n = q.size();
            for(int i=0; i<idx; i++){
                q.add(q.remove());
            }
            q.remove();
            for(int i=idx; i<n-1; i++){
                q.add(q.remove());
            }
        }
    }
    static int get(Queue<Integer> q, int idx){
        if(idx < 0 || idx >= q.size()){
            System.out.print("Index out of bound ");
            return -1;
        }
        int n = q.size();
        for(int i=0; i<idx; i++){
            q.add(q.remove());
        }
        int num = (int)q.peek();
        for(int i=idx; i<n; i++){
            q.add(q.remove());
        }
        return num;
    }
    static void traverse(Queue<Integer> q){
        int n = q.size();
        for(int i=0; i<n; i++){
            System.out.print(q.peek()+" ");
            q.add(q.remove());
        }
        System.out.println();
    }
    static int top(Queue<Integer> q){
        int n = (int)q.peek();
        return n;
    }
    static void reverse(Queue<Integer> q){
        Stack<Integer> st = new Stack<>();
        while(!q.isEmpty()){
            st.push(q.remove());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
    }

    static void main() {
        Queue<Integer> q = new LinkedList<>();
        insertAtFront(q, 10);
        insertAtFront(q, 20);
        insertAtFront(q, 30);
        insertAtFront(q, 40);
        insertAtFront(q, 50);
        insertAtFront(q, 60);
        insertAtRear(q, 100);
        traverse(q);
        insert(q, 3, 69);
        deleteAtFront(q);
        deleteAtRear(q);
        traverse(q);
        System.out.println(top(q));
        delete(q, 3);
        traverse(q);
        System.out.println(get(q, 6));
        reverse(q);
        traverse(q);
    }
}