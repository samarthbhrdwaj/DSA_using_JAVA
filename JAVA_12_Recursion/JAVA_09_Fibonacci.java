package JAVA_12_Recursion;
public class JAVA_09_Fibonacci {
    static int fibo(int n){
        if(n==1 || n==0) return n;
        return fibo(n-1) + fibo(n-2);
    }
    static void main() {
        int n = 0;
        System.out.println(fibo(n));
    }
}