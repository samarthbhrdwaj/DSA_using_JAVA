package JAVA_12_Recursion;
public class JAVA_07_ReverseNum {
    static int res = 0;
    static void rev(int n){
        if(n == 0) return;
        res = res * 10 + n%10;
        rev(n/10);
    }
    static void main() {
        int n = 41256;
        rev(n);
        System.out.println(res);
    }
}