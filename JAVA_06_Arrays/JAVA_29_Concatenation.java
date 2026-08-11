package JAVA_06_Arrays;
public class JAVA_29_Concatenation {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int[] result = new int[n*2];
        for(int i=0; i<n; i++){
            result[i] = arr[i];
        }
        for(int i=n; i<result.length; i++){
            result[i] = arr[i-n];
        }
        for(int ele : result){
            System.out.print(ele+" ");
        }
    }
}