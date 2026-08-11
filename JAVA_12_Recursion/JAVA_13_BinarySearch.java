package JAVA_12_Recursion;
public class JAVA_13_BinarySearch {
    static int binarySearch(int[] arr, int ele, int low, int high){
        if(low > high) return -1;
        int mid = low + (high - low) / 2;
        if(arr[mid] == ele) return mid;
        else if(arr[mid] > ele) return binarySearch(arr, ele, 0, mid-1);
        else return binarySearch(arr, ele, mid+1, high);
    }
    static void main() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(binarySearch(arr, 8, 0, arr.length-1));
    }
}