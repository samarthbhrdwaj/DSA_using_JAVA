package JAVA_06_Arrays;
import java.util.Arrays;
public class JAVA_20_MissingInArray {
//    static int missingNum(int[] arr){
//        int n = arr.length;
//        if(arr[0] != 1) return 1;
//        int i=0;
//        for(; i<n-1; i++){
//            if(arr[i]+1 != arr[i+1]){
//                return arr[i]+1;
//            }
//        }
//        return arr[i]+1;
//    }
    static int missingNum(int[] arr){
       int n = arr.length+1;
       int sum = n*(n+1)/2;
       int arraySum = 0;
       for(int ele : arr){
           arraySum += ele;
       }
       return sum - arraySum;
    }
    static void main() {
        int[] arr = {1, 2, 3};
        Arrays.sort(arr);
        int missing = missingNum(arr);
        System.out.println(missing);
    }
}