package JAVA_08_Sorting;
public class JAVA_05_KthLargest {
    static void main() {
        int[] arr = {2, 4, 5, 9, 7, 6, 3, 1, 8,};
        int n = 4;
        for(int i=0; i<n; i++){
            int max = Integer.MIN_VALUE;
            int idx = i;
            for(int j=0; j<arr.length-i; j++){
                if(arr[j] > max){
                    max = arr[j];
                    idx = j;
                }
            }
            arr[arr.length-1-i] = arr[idx] + arr[arr.length-1-i] - (arr[idx] = arr[arr.length-1-i]);
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        System.out.println(arr[arr.length-n]);
    }
}
