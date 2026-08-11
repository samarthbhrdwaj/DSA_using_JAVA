package JAVA_08_Sorting;
public class JAVA_01_IsSort {
    static void main() {
        int[] arr = {2, 4, 5, 10, 6, 8, 10};
        boolean status = true;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                status = false;
                System.out.println("Array Not sorted.");
                break;
            }
        }
        if(status) System.out.println("Array is sorted.");
    }
}