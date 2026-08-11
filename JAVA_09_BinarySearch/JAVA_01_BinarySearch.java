package JAVA_09_BinarySearch;
public class JAVA_01_BinarySearch {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int low = 0, high = arr.length - 1;
        int target = 2;
        boolean status = true;
        while(low<=high){
            int mid = (low + high) / 2;
            if(arr[mid] < target){
                low = mid + 1;
                status = false;
            }
            else if(arr[mid] > target){
                high = mid - 1;
                status = false;
            }
            else{
                status = true;
                break;
            }
        }
        if(status) System.out.println("Element found");
        else System.out.println("Element not found");
    }
}