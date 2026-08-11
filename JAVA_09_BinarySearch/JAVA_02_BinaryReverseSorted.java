package JAVA_09_BinarySearch;
public class JAVA_02_BinaryReverseSorted {
    static void main() {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int target = 2;
        boolean status = true;
        int low = 0, high = arr.length-1, index = -1;
        while(low<=high){
            int mid = (low + high) / 2;
            if(arr[mid] > target){
                low = mid + 1;
                status = false;
            }
            else if(arr[mid] < target){
                high = mid - 1;
                status = false;
            }
            else{
                status = true;
                index = mid;
                break;
            }
        }
        if(status) System.out.println("Element Found at index: "+index);
        else System.out.println("Element Not found");
    }
}