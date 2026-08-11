package JAVA_06_Arrays;
public class JAVA_06_MaxInArray {
    static void main() {
        int[] arr = {-8, 5, -6, 2, -3, 7, -6, 8, -9, 2};
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max) max = arr[i];
        }
        System.out.println(max);
    }
}