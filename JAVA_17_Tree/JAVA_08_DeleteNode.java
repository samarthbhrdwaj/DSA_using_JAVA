package JAVA_17_Tree;

public class JAVA_08_DeleteNode {
    static void display(Node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
    static Node delete(Node root, int key){
        if(root == null) return null;
        if(root.val > key){
            root.left = delete(root.left, key);
        }
        else if(root.val < key){
            root.right = delete(root.right, key);
        }
        else{
            if(root.left == null && root.right == null) return null;
            if(root.right == null) return root.left;
            if(root.left == null) return root.right;
            Node pre = root.left;
            while(pre.right!=null) pre = pre.right;
            root.left = delete(root.left, pre.val);
            pre.right = root.right;
            pre.left = root.left;
            return pre;
        }
        return root;
    }
    static void main() {
        //                3
        //              1   6
        //            -1 2 4 9
        Node a = new Node(3);
        Node b = new Node(1);
        Node c = new Node(6);
        Node d = new Node(-1);
        Node e = new Node(2);
        Node f = new Node(4);
        Node g = new Node(9);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        display(a);
        System.out.println();
        delete(a, 6);
        display(a);
    }
}
