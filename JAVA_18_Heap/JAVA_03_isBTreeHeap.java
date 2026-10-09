package JAVA_18_Heap;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
public class JAVA_03_isBTreeHeap {
    static int s;
    public static boolean isHeap(Node root) {
        s = size(root);
        return Heap(root) && isCBT(root, 1);
    }
    public static int size(Node root){
        if(root == null) return 0;
        return 1 + size(root.right) + size(root.left);
    }
    public static boolean Heap(Node root){
        if(root == null) return true;
        int left = (root.left!=null) ? root.left.data : Integer.MIN_VALUE;
        int right = (root.right!=null) ? root.right.data : Integer.MIN_VALUE;
        if(root.data <= left || root.data <= right) return false;
        return Heap(root.left) && Heap(root.right);
    }
    public static boolean isCBT(Node root, int idx){
        if(root == null) return true;
        if(idx > s) return false;
        return isCBT(root.left, idx*2) && isCBT(root.right, idx*2+1);
    }
    static void main() {
//                9
//              6   5
//            -1 1 3 4
        Node a = new Node(9);
        Node b = new Node(6);
        Node c = new Node(5);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(3);
        Node g = new Node(4);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        if(isHeap(a)) System.out.println("Yes Binary Tree is Heap");
        else System.out.println("Binary Tree is not Heap");
    }
}