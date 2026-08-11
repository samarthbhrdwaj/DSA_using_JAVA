package JAVA_09_BinarySearch;
public class JAVA_10_SortedRotatedBS {
    static void main() {
        int[] arr = {2, 3, 4, 5, 1};
        int target = 1;
        int low = 0, high = arr.length-1, mid;
        while(low<=high){
            mid = low + (high - low) / 2;
            if(arr[mid] == target){
                System.out.println(mid);
                break;
            }
            else if(arr[mid] >= arr[low]){
                if(arr[low] <= target && target < arr[mid]){
                    high = mid - 1;
                }
                else low = mid + 1;
            }
            else{
                if(arr[mid] < target && target <= arr[high]){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
        }
    }
}