package JAVA_16_Queue;
class DEQueue{
    int[] arr;
    int size;
    int r;
    int f;
    int capacity;
    DEQueue(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
    }
    void add(int val){
        if(size == capacity){
            System.out.println("DEQueue is Full");
            return;
        }
        arr[r++] = val;
        if(r == capacity) r = 0;
        size++;
    }
    int remove(){
        if(size == 0){
            System.out.println("DEQueue is Empty");
            return -1;
        }
        int val = arr[f];
        f++;
        if(f == capacity) f = 0;
        size--;
        return val;
    }
    int peek(){
        if(size == 0){
            System.out.println("DEQueue is Empty");
            return -1;
        }
        return arr[f];
    }
    void display(){
        if(size == 0) return;
        if(f>=r){
            for(int i=f; i<capacity; i++){
                System.out.print(arr[i]+" ");
            }
            for(int i=0; i<r; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        else{
            for(int i=f; i<r; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
public class JAVA_05_DEQueueArray {
    static void main() {
        DEQueue q = new DEQueue(4);
        q.add(10);
        q.add(20);
        q.add(30);
        q.display();
        System.out.println(q.remove());
        q.display();
        q.add(40);
        q.add(50);
        q.display();
    }
}