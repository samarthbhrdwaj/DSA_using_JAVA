package JAVA_12_Recursion;
public class JAVA_03_GlobalVariable {
    static int n = 10;
    static void main() {
        System.out.println(n);
        n = 100;
        System.out.println(n);
        int n = 50;
        System.out.println(n);
        n = 500;
        System.out.println(n);
    }
}