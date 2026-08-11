package JAVA_06_Arrays;
public class JAVA_09_PassingArrayToMethod {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }
    static void change(int[] arr){
        arr[0] = 50;
    }
}