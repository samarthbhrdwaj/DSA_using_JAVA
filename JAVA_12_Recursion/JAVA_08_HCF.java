package JAVA_12_Recursion;
public class JAVA_08_HCF {
    static int hcf(int a, int b){
        if(a == 0) return b;
        return hcf(b%a, a);
    }
    static void main() {
        int n1 = 16;
        int n2 = 12;
        System.out.println("HCF = "+hcf(n1, n2));
    }
}