package JAVA_08_Sorting;
public class JAVA_02_BubbleSort {
    // STABLE SORTING
    static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static void main() {
        int[] arr = {2, 4, 7, 5, 8, 9, 7, 1, 6, 3, 1 };
        print(arr);
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            boolean status = true;
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    status = false;
                }
            }
            if(status) break;
        }
        print(arr);
    }
}