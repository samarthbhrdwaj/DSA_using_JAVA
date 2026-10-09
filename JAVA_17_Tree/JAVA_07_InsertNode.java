package JAVA_17_Tree;

public class JAVA_07_InsertNode {
    public static Node insertIntoBST(Node root, int val) {
        Node data = new Node(val);
        if (root == null) return data;
        Node d = root;
        while(d.left!=null || d.right!=null){
            if(d.val < val){
                if(d.right == null) break;
                d = d.right;
            }
            else if(d.val > val){
                if(d.left == null) break;
                d = d.left;
            }
        }
        if(d.val > val) d.left = data;
        else d.right = data;
        return root;
    }
    static void display(Node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
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
        display(a);
        System.out.println();
        insertIntoBST(a, 69);
        display(a);
    }
}
