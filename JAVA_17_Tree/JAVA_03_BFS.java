package JAVA_17_Tree;

import java.util.LinkedList;
import java.util.Queue;

class Pair{
    Node node;
    int level;
    Pair(Node node, int level){
        this.node = node;
        this.level = level;
    }
}
public class JAVA_03_BFS {
    static void bfs(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node temp = q.remove();
            System.out.print(temp.val+" ");
            if(temp.left!=null) q.add(temp.left);
            if(temp.right!=null) q.add(temp.right);
        }
        System.out.println();
    }
    static void bfsLevel(Node root){
        Queue<Pair> q = new LinkedList<>();
        Pair p = new Pair(root, 0);
        int currentLevel = 0;
        q.add(p);
        while(!q.isEmpty()){
            Pair temp = q.remove();
            if(temp.level != currentLevel){
                currentLevel++;
                System.out.println();
            }
            System.out.print(temp.node.val+" ");
            if(temp.node.left!=null) q.add(new Pair(temp.node.left, temp.level+1));
            if(temp.node.right!=null) q.add(new Pair(temp.node.right, temp.level+1));
        }
        System.out.println();
    }
    static void kthLevel(Node root, int level, int k){
        if(root == null) return;
        if(level == k) System.out.print(root.val+" ");
        kthLevel(root.left, level+1, k);
        kthLevel(root.right, level+1, k);
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
//        bfs(a);
//        bfsLevel(a);
        kthLevel(a, 0, 1);
    }
}
