package JAVA_09_BinarySearch;
public class JAVA_06_SingleInDouble {
    static int found(int[] arr){
        int low = 0, high = arr.length-1;
        while(low<high){
            int mid = low + (high - low) / 2;
            if(mid % 2 == 1){
                mid--;
            }
            if (arr[mid] == arr[mid+1]){
                low = mid + 2;
            }
            else{
                high = mid;
            }
        }
        return arr[low];
    }
    static void main() {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 5};
        System.out.println(found(arr));
    }
}