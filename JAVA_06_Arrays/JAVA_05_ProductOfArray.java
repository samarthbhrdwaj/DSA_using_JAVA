package JAVA_06_Arrays;
public class JAVA_05_ProductOfArray {
    static void main() {
        int[] arr = {2, 5, 4, 7, 8, 6};
        int product = 1;
        for(int i=0; i<arr.length; i++){
            product *= arr[i];
        }
        System.out.println(product);
    }
}