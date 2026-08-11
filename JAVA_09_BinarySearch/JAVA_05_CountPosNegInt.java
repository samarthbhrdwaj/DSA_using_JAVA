package JAVA_09_BinarySearch;
public class JAVA_05_CountPosNegInt {
    static void main() {
        int[] arr = {-5, -4, -3, -2, -1, -1, -1, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int low = 0, high = arr.length-1;
        while(low<=high){
            int mid = low + (high - low) / 2;
            if(arr[mid] >= 0){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        int neg = low;
        low = 0;
        high = arr.length-1;
        while(low<=high){
            int mid = low + (high - low) / 2;
            if(arr[mid] <= 0){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        int pos = arr.length - low;
        System.out.println("Negative: "+neg);
        System.out.println("Positive: "+pos);
    }
}