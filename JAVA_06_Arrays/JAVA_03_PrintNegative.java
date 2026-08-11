package JAVA_06_Arrays;
public class JAVA_03_PrintNegative {
    static void main() {
        int[] arr = {-1,-2, 3, 4, 5, -6, -7, 8, -9};
        for(int i=0; i<arr.length; i++){
            if(arr[i]<0) System.out.print(arr[i]+" ");
        }
    }
}