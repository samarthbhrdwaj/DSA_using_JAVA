package JAVA_09_BinarySearch;
public class JAVA_09_ArrangeCoin {
    static long sqrt(long n){
        long low = 0, high = n;
        while(low<=high){
            long mid = low + (high - low) / 2;
            if(mid == n / mid) return mid;
            else if(mid > n / mid) high = mid - 1;
            else low = mid + 1;
        }
        return high;
    }
    static int arrangeCoins(int n) {
        long x = n;
        long rt = (sqrt(8*x+1) - 1) / 2;
        return (int)(rt);
    }
    static void main() {
        int n = 1804289383;
        int result = arrangeCoins(n);
        System.out.println(result);
    }
}