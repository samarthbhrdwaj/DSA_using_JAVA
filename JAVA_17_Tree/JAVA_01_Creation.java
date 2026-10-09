package JAVA_17_Tree;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
        left = null;
        right = null;
    }
}
public class JAVA_01_Creation {
    static void display(Node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
    static int size(Node root){
        if(root == null) return 0;
        return 1 + size(root.left) + size(root.right);
    }
    static int sum(Node root){
        if(root == null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }
    static int product(Node root){
        if(root == null) return 1;
        return root.val * product(root.left) * product(root.right);
    }
    static int productNonZero(Node root){
        if(root == null) return 1;
        if(root.val == 0) return productNonZero(root.left) * productNonZero(root.right);
        return root.val * productNonZero(root.left) * productNonZero(root.right);
    }
    static int max(Node root){
        if(root == null) return Integer.MIN_VALUE;
        return Math.max(root.val, Math.max(max(root.left), max(root.right)));
    }
    static int min(Node root){
        if(root == null) return Integer.MAX_VALUE;
        return Math.min(root.val, Math.min(min(root.left), min(root.right)));
    }
    static int level(Node root){
        if(root == null) return 0;
        return 1 + Math.max(level(root.left), level(root.right));
    }
    static void main() {
//                3
//              4   2
//            -1 1 6 9
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(0);
        Node f = new Node(6);
        Node g = new Node(9);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        display(a);
        System.out.println();
        System.out.println("Size of tree: "+size(a));
        System.out.println("Sum of tree: "+sum(a));
        System.out.println("Product of tree: "+product(a));
        System.out.println("Product of Non-Zero of tree: "+productNonZero(a));
        System.out.println("Maximum of tree: "+max(a));
        System.out.println("Minimum of tree: "+min(a));
        System.out.println("Levels of tree: "+level(a));
    }
}