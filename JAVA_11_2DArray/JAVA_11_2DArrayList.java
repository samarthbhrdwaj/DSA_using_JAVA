package JAVA_11_2DArray;
import java.util.ArrayList;
public class JAVA_11_2DArrayList {
    static void main() {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(2);
        b.add(3);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(4);
        c.add(5);
        c.add(6);
        ArrayList<Integer> d = new ArrayList<>();
        d.add(7);
        d.add(8);
        d.add(9);
        d.add(10);
        arr.add(a);
        arr.add(b);
        arr.add(c);
        arr.add(d);
        arr.add(new ArrayList<>());
        System.out.println(arr);
        arr.get(0).set(0, 69);
        System.out.println(arr);
        for(ArrayList<Integer> list : arr){
            for(int ele : list){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
        for(int i=0; i<arr.size(); i++){
            for(int j=0; j<arr.get(i).size(); j++){
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}