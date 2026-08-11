package JAVA_06_Arrays;
import java.util.Arrays;
public class JAVA_11_SortArrayBuiltIn {
    static void main() {
        int[] arr =  {4, 2, 1, 5, -3, -10, 2};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
    static void print(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}