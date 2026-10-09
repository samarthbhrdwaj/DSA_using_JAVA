package JAVA_18_Heap;
import java.util.*;
public class JAVA_04_BSTtoHeap {
    static void inorder(Node root, ArrayList<Integer> arr){
        if(root == null) return;
        inorder(root.left, arr);
        arr.add(root.data);
        inorder(root.right, arr);
    }
    static void postorder(Node root, ArrayList<Integer> arr){
        if(root == null) return;
        postorder(root.left, arr);
        postorder(root.right, arr);
        root.data = arr.remove(0);
    }
    public static void convertToMaxHeap(Node root) {
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root, arr);
        postorder(root, arr);
    }
    static void display(Node root){
        if(root == null) return;
        System.out.print(root.data+" ");
        display(root.left);
        display(root.right);
    }
    static void main() {
//                3
//              4   2
//            -1 1 6 9
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        display(a);
        System.out.println();
        convertToMaxHeap(a);
        display(a);
    }
}
