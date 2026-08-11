package JAVA_06_Arrays;
import java.util.Arrays;
public class JAVA_10_ShallowDeepCopy {
    static void main() {
        // Shallow Copy
        int[] arr = {1, 2, 3, 4, 5};
        int[] x = arr;
        x[2] = 500;
        System.out.println(arr[2]);

        // Deep Copy
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] x2 = Arrays.copyOf(arr2, arr2.length);
        x2[2] = 500;
        System.out.println(arr2[2]);
    }
}