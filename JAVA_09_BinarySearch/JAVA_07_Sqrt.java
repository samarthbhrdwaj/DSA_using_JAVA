package JAVA_09_BinarySearch;
public class JAVA_07_Sqrt {
    static void main() {
        int n = 69;
        int low = 0, high = n;
        while(low<=high){
            int mid = low + (high - low) / 2;
            if(mid*mid == n){
                System.out.println("Square root is: "+mid);
                break;
            }
            else if(mid*mid > n) high = mid - 1;
            else low = mid + 1;
        }
        System.out.println("Square root is: "+high  );
    }
}