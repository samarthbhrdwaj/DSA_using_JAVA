package JAVA_18_Heap;
import java.util.*;
public class JAVA_01_Heap {
    static void main() {
        // MinHeap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        // MaxHeap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap.add(10);
        minHeap.add(5);
        minHeap.add(96);
        minHeap.add(-9);
        minHeap.add(8);
        minHeap.add(15);
        System.out.println(minHeap);
        System.out.println(minHeap.peek());
        System.out.println(minHeap.size());
        System.out.println(minHeap.remove());
        System.out.println(minHeap);
        System.out.println(minHeap.size());
    }
}