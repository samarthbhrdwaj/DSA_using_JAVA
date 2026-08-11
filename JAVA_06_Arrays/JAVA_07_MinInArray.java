package JAVA_06_Arrays;
public class JAVA_07_MinInArray {
    static void main() {
        int[] arr = {-2, 5, -8, 9, -6, 7, -3, 1};
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] < min) min = arr[i];
        }
        System.out.println(min);
    }
}