package JAVA_08_Sorting;
public class JAVA_04_SelectionSort {
    // UNSTABLE SORTING
    static void main() {
        int[] arr = {2, 4, 5, 1, 3, 4, 9 ,8, 7, 6};
        for(int i=0; i<arr.length-1; i++){
            boolean status = true;
            for(int j=0; j<arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    status = false;
                    break;
                }
            }
            if(status) break;
            int min = Integer.MAX_VALUE;
            int idx = -1;
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

        // Find Larger First
//        for(int i=0; i<arr.length-1; i++){
//            boolean status = true;
//            for(int j=0; j<arr.length-1; j++){
//                if(arr[j] > arr[j+1]){
//                    status = false;
//                    break;
//                }
//            }
//            if(status) break;
//            int max = Integer.MIN_VALUE;
//            int idx = -1;
//            for(int j=0; j<arr.length-i; j++){
//                if(arr[j] > max){
//                    max = arr[j];
//                    idx = j;
//                }
//            }
//            arr[arr.length-1-i] = arr[idx] + arr[arr.length-1-i] - (arr[idx] = arr[arr.length-i-1]);
//        }

    }
}