package JAVA_06_Arrays;
public class JAVA_26_Segregate012 {
    static void main() {
        int[] arr = {0, 2, 1, 1, 2, 0, 0, 2, 1, 2, 0, 1};
        int n = arr.length;
        int zero = 0, one = 0, two = 0;
        for(int i=0; i<n; i++){
            if(arr[i] == 0) zero++;
            else if(arr[i] == 1) one++;
            else two++;
        }
        for(int i=0; i<zero; i++) arr[i] = 0;
        for(int i=zero; i<zero+one; i++) arr[i] = 1;
        for(int i=zero+one; i<n; i++) arr[i] = 2;
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}