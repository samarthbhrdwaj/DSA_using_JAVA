package JAVA_06_Arrays;
public class JAVA_21_Segregate01 {
    static void main() {
        int[] arr = {0, 0, 1, 1, 1, 0, 1, 0};
//        int zero = 0;
//        int one = 0;
//        for(int ele : arr){
//            if(ele == 0) zero++;
//            else one++;
//        }
//        for(int i=0; i<zero; i++){
//            arr[i] = 0;
//        }
//        for(int i=zero; i<arr.length; i++){
//            arr[i] = 1;
//        }
        int i=0, j=arr.length-1;
        while(i<j){
           if(arr[i] == 0 && arr[j] == 1){
               i++;
               j--;
           }
           else if(arr[i] == 0 && arr[j] == 0){
               i++;
           }
           else if(arr[i] == 1 && arr[j] == 1){
               j--;
           }
           else{
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
               i++;
               j--;
           }
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}