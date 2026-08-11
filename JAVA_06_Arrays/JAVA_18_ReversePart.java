package JAVA_06_Arrays;
public class JAVA_18_ReversePart {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        int i=2, j=5;
        while(i<j){
            arr[i] = arr[j] + arr[i] - (arr[j] = arr[i]);
            i++;
            j--;
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}