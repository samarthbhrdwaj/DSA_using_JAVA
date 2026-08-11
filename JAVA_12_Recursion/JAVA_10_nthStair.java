package JAVA_12_Recursion;
public class JAVA_10_nthStair {
    static int stair(int n){
        if(n==1 || n==2) return n;
        return stair(n-1)+stair(n-2);
    }
    static void main() {
        int n = 5;
        System.out.println(stair(n));
    }
}