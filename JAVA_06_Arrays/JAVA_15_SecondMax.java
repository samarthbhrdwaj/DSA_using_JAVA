package JAVA_06_Arrays;
public class JAVA_15_SecondMax {
    static void main() {
        int[] arr = {10, 5, 10};
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max) max = arr[i];
        }
        int sMax = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > sMax && arr[i] != max) sMax = arr[i];
        }
        if(sMax == Integer.MIN_VALUE) System.out.println(-1);
        else System.out.println(sMax);
    }
}