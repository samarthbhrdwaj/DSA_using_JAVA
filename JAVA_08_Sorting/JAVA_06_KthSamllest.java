package JAVA_08_Sorting;
public class JAVA_06_KthSamllest {
    static void main() {
        int[] arr = {2, 4, 5, 9, 7, 6, 3, 1, 8,};
        int n = 4;
        for(int i=0; i<n; i++){
            int min = Integer.MAX_VALUE;
            int idx = i;
            for(int j=i; j<arr.length; j++){
                if(arr[j] < min){
                    min = arr[j];
                    idx = j;
                }
            }
            arr[i] = arr[idx] + arr[i] - (arr[idx] = arr[i]);
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        System.out.println(arr[n-1]);
    }
}