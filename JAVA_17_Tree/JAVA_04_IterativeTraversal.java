package JAVA_17_Tree;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
public class JAVA_04_IterativeTraversal {
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

        // Preorder
        Stack<Node> st = new Stack<>();
        ArrayList<Integer> arr = new ArrayList<>();
        st.add(a);
        while(!st.isEmpty()){
            Node top = st.pop();
            arr.add(top.val);
            if(top.right!=null) st.push(top.right);
            if(top.left!=null) st.push(top.left);
        }
        System.out.print("Preorder: ");
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();

        // Postorder
        Stack<Node> s2t = new Stack<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        st.add(a);
        while(!st.isEmpty()){
            Node top = st.pop();
            arr2.add(top.val);
            if(top.left!=null) st.push(top.left);
            if(top.right!=null) st.push(top.right);
        }
        System.out.print("Postorder: ");
        Collections.reverse(arr2);
        for(int ele : arr2){
            System.out.print(ele+" ");
        }
        System.out.println();

        // Inorder
        Stack<Node> st3 = new Stack<>();
        ArrayList<Integer> arr3 = new ArrayList<>();
        Node current = a;
        while(!st3.isEmpty() || current!=null){
            if(current!=null){
                if(current.left != null){
                    st3.push(current);
                    current = current.left;
                }
                else{
                    arr3.add(current.val);
                    current = current.right;
                }
            }
            else{
                Node top = st3.pop();
                arr3.add(top.val);
                current = top.right;
            }
        }
        System.out.print("Inorder: ");
        for(int ele : arr3){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
