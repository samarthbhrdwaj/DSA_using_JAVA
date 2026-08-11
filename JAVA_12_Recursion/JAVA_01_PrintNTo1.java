package JAVA_12_Recursion;

public class JAVA_01_PrintNTo1 {
    static void print(int n){
        if(n==0) return;
        System.out.println(n);
        print(n-1);
    }
    static void main() {
        int n = 10;
        print(n);
    }
}
