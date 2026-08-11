package JAVA_08_Sorting;
public class JAVA_07_InsertionSort {
    // STABLE SORTING
    static void main() {
        int[] arr = {5, 7, 2, 1, 4, 7, 8, 9, 7, 6, 3};
        int n = arr.length;
        for(int i=0; i<n; i++){
            int j=i;
            while(j>0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}