package JAVA_17_Tree;
public class JAVA_06_MorrisTraversal {
    static void morris(Node root){
        Node curr = root;
        Node pre = null;
        while(curr != null){
            if(curr.left != null){
                pre = curr.left;
                while(pre.right != null && pre.right != curr){
                    pre = pre.right;
                }
                if(pre.right == null){
                    pre.right = curr;
                    curr = curr.left;
                }
                else if(pre.right == curr){
                    pre.right = null;
                    System.out.print(curr.val+" ");
                    curr = curr.right;
                }
            }
            else{
                System.out.print(curr.val+" ");
                curr = curr.right;
            }
        }
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
        morris(a);
    }
}
