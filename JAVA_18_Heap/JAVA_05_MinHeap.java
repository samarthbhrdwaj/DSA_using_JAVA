package JAVA_18_Heap;
class MinHeap{
    int[] arr;
    int idx = 1;
    int peek() {
        return arr[1];
    }
    int size(){
        return idx-1;
    }
    MinHeap(int capacity){
        arr = new int[capacity+1];
    }
    void display(){
        for(int i=1; i<idx; i++) System.out.print(arr[i]+" ");
        System.out.println();
    }
    void add(int n){
        arr[idx++] = n;
        int root = idx-1;
        while(root!=1){
            int parent = root/2;
            if(arr[root] < arr[parent]){
                int temp = arr[root];
                arr[root] = arr[parent];
                arr[parent] = temp;
                root = parent;
            }
            else break;
        }
    }
    int remove(){
        int min = arr[1];
        arr[1] = arr[idx-1];
        idx--;
        int root = 1;
        while(root <= size()){
            int left = 2*root, right = 2*root+1;
            int leftVal = (left<=size()) ? arr[left] : Integer.MAX_VALUE;
            int rightVal = (right<=size()) ? arr[right] : Integer.MAX_VALUE;
            if(arr[root] < leftVal && arr[root] < rightVal) break;
            if(arr[root] > leftVal){
                int temp = arr[root];
                arr[root] = arr[left];
                arr[left] = temp;
                root = left;
            }
            else{
                int temp = arr[root];
                arr[root] = arr[right];
                arr[right] = temp;
                root = right;
            }
        }
        return min;
    }
}
public class JAVA_05_MinHeap {
    static void main() {
        MinHeap m = new MinHeap(10);
        m.add(10);;
        m.add(15);
        m.add(8);
        m.add(9);
        m.add(4);
        m.display();
    }
}