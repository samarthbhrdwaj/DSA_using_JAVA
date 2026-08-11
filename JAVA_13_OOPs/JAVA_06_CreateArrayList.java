package JAVA_13_OOPs;
class Arraylist{
    int[] arr;
    int size = 0;
    int idx = 0;
    Arraylist(int capacity){
        arr = new int[capacity];
    }
    int capacity(){
        return size;
    }
    void add(int value){
        if(idx == arr.length){
            int[] arr2 = new int[2*arr.length];
            for(int i=0; i<arr.length; i++){
                arr2[i] = arr[i];
            }
            arr = arr2;
        }
        arr[idx++] = value;
        size++;
    }
    void display(){
        System.out.print("[ ");
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("]");
    }
    int get(int index){
        return arr[index];
    }
    void set(int index, int value){
        arr[index] = value;
    }
    void remove(){
        size--;
    }
    void remove(int index){
        for(int i=index; i<size-1; i++){
            arr[i] = arr[i+1];
        }
        size--;
    }
    void insert(int index, int value){
        if(idx == arr.length){
            int[] arr2 = new int[2*arr.length];
            for(int i=0; i<arr.length; i++){
                arr2[i] = arr[i];
            }
            arr = arr2;
        }
        size++;
        idx++;
        for(int i=size-1; i>index; i--){
            arr[i] = arr[i-1];
        }
        arr[index] = value;
    }
}
public class JAVA_06_CreateArrayList {
    static void main() {
        Arraylist arr = new Arraylist(3);
        System.out.println(arr.capacity());
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);
        arr.add(70);
        arr.add(80);
        arr.add(90);
        arr.add(100);
        arr.add(110);
        arr.add(120);
        arr.display();
        arr.remove();
        arr.display();
        arr.remove(6);
        arr.display();
        arr.insert(5, 789);
        arr.display();
        System.out.println(arr.capacity());
    }
}
