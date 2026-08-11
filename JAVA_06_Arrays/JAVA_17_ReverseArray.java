package JAVA_06_Arrays;
public class JAVA_17_ReverseArray {
    static void main() {
        int[] arr = {11, 52, 93, 64, 75, 26, 47, 38};
        int n = arr.length;
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        for(int i=0; i<n/2; i++){
            arr[i] = arr[n-i-1] + arr[i] - (arr[n-i-1] = arr[i]);
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}