package JAVA_06_Arrays;
import java.util.Scanner;
public class JAVA_14_TwoSum {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean status = false;
        int idx1 = -1, idx2 = -1;
        int[] arr = {12, 72, 53, 34, 95, 16, 74, 28, 89};
        a:for(int i=0; i<arr.length-1; i++){
            b:for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == n){
                    status = true;
                    idx1 = i;
                    idx2 = j;
                    break a;
                }
            }
        }
        int[] result = new int[2];
        result[0] = idx1;
        result[1] = idx2;
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }
    }
}