package JAVA_06_Arrays;
import java.util.ArrayList;
import java.util.Collections;
public class JAVA_24_AddingOne {
    static void main() {
        int[] arr = {9, 9, 8};
//        ArrayList<Integer> result = new ArrayList<>();
//        int carry = 1;
//        for(int i=arr.length-1; i>=0; i--){
//            if(arr[i]+carry >= 10){
//                result.add(0);
//                carry = 1;
//            }
//            else{
//                result.add(arr[i]+carry);
//                carry = 0;
//            }
//        }
//        if(carry == 1){
//            result.add(1);
//        }
//        Collections.reverse(result);
//        System.out.println(result);
        int carry = 1;
        int[] result = new int[arr.length+1];
        int i;
        for(i=result.length-2; i>=0; i--){
            if(arr[i]+carry >= 10){
                carry = 1;
                result[i] = 0;
            }
            else{
                result[i] = arr[i] + carry;
                carry = 0;
            }
        }
        if(carry == 0){
            result[i] = 1;
        }
        for(int ele : result){
            System.out.print(ele+" ");
        }
    }
}