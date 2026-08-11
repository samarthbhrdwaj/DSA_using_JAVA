package JAVA_06_Arrays;
import java.util.*;
public class JAVA_23_ArrayList {
    static void main() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(7);
        arr.add(18);
        arr.add(45);

        System.out.println(arr.get(1)); //arr[1]

        arr.set(3, 33);  //arr[3] = 33

        int n = arr.size();

        System.out.println(arr);

        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();

        for(int i=0; i<n; i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();

        arr.remove(arr.size()-2);
        System.out.println(arr);

        Collections.reverse(arr);
        System.out.println(arr);
    }
}