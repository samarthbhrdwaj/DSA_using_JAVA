package JAVA_12_Recursion;
public class JAVA_06_Power {
    static int pow(int a, int b){
        if(b == 0) return 1;
        int call = pow(a, b/2);
        if(b%2 == 0) return call*call;
        else return call*call*a;

//        return a * (pow(a, b-1));
    }
    static void main() {
        int a = 2;
        int b = 3;
        int res = pow(a, b);
        System.out.println(res);
    }
}