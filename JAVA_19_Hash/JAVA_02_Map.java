package JAVA_19_Hash;
import java.util.HashMap;
public class JAVA_02_Map {
    static void main() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Peter");
        map.put(2, "Tony");
        map.put(3, "Steve");
        map.put(4, "Bruce");
        map.put(5, "Sam");
        System.out.println(map);
        System.out.println(map.get(3));
        System.out.println(map.remove(4));
        System.out.println(map);
        System.out.println(map.size());

    }
}