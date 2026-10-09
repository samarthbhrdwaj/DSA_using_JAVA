package JAVA_17_Tree;

import java.util.ArrayList;

public class JAVA_05_BoundryTraversal {
    static void main() {
        //                3
        //              4   2
        //            -1 1 6 9
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(9);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        boundryTraversal(a);
    }
    static void boundryTraversal(Node root){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(root.val);
        if(root.left == null && root.right == null){
            System.out.println(arr);
            return;
        }
        leftNode(root.left, arr);
        leafNode(root, arr);
        rightNode(root.right, arr);
        System.out.println(arr);
    }
    static void leftNode(Node root, ArrayList<Integer> arr){
        if(root == null || (root.left == null && root.right == null)) return;
        arr.add(root.val);
        if(root.left!=null) leftNode(root.left, arr);
        else leftNode(root.right, arr);
    }
    static void leafNode(Node root, ArrayList<Integer> arr){
        if(root == null) return;
        if(root.left == null && root.right == null) arr.add(root.val);
        leafNode(root.left, arr);
        leafNode(root.right, arr);
    }
    static void rightNode(Node root, ArrayList<Integer> arr){
        if(root == null || (root.left == null && root.right == null)) return;
        if(root.right!=null) rightNode(root.right, arr);
        else rightNode(root.left, arr);
        arr.add(root.val);
    }
}
