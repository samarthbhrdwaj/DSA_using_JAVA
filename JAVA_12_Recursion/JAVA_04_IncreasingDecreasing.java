package JAVA_12_Recursion;
public class JAVA_04_IncreasingDecreasing {
    static void print(int n){
        if(n==1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n-1);
        System.out.println(n);
    }
    static void main() {
        int n = 5;
        print(n);
    }
}