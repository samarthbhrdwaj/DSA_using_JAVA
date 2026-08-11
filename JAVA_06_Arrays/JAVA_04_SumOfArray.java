package JAVA_06_Arrays;
public class JAVA_04_SumOfArray {
    static void main() {
        int[] arr = {1, 5, 2, 4, 6, 3, 9};
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}