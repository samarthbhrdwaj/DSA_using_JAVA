package JAVA_06_Arrays;
import java.util.Scanner;
public class JAVA_19_RotateArray {
    static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static void swap(int[] arr, int first, int last){
        int i=first, j=last-1;
        while(i<j){
            arr[i] = arr[j] + arr[i] - (arr[j] = arr[i]);
            i++;
            j--;
        }
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("Enter rotate number: ");
        int d = sc.nextInt();
        int n = arr.length;
        d = d % n;
        print(arr);
        swap(arr, 0, d);
        swap(arr, d, n);
        swap(arr, 0, n);
        print(arr);
    }
}