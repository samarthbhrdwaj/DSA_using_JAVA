package JAVA_19_Hash;
import java.util.HashSet;
public class JAVA_01_Set {
    static void main() {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        System.out.println(set);
        set.remove(2);
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.contains(8));
        for(int ele : set){
            System.out.print(ele+" ");
        }
    }
}