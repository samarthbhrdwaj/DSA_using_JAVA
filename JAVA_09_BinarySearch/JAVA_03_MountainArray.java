package JAVA_09_BinarySearch;
public class JAVA_03_MountainArray{
    static void main() {
        int[] arr = {1, 2, 3};
        int low = 1, high = arr.length-2;
        int mid = -1;
        while(low<=high){
            mid = (low + high) / 2;
            if(arr[mid+1] < arr[mid] && arr[mid-1] < arr[mid]){
                break;
            }
            else if(arr[mid+1] > arr[mid] && arr[mid-1] < arr[mid]){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        System.out.println(mid);
    }
}