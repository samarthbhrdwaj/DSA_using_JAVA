package JAVA_09_BinarySearch;

public class JAVA_04_Floor {
    static int floor(int[] arr, int x){
        int low = 0, high = arr.length-1;
        while(low<high){
            int mid = (low + high) / 2;
            if(arr[mid] < x && arr[mid+1] > x) return mid;
            else if(arr[mid] < x && arr[mid+1] < x) low = mid;
            else if(arr[mid] > x) high = mid;
        }
        return -1;
    }
    static void main() {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int x = 0;
        int result = floor(arr, x);
        System.out.println(result);
    }
}
