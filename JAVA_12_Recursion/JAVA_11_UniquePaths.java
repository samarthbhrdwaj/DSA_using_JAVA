package JAVA_12_Recursion;
public class JAVA_11_UniquePaths {
    static int paths(int m, int n){
        if(m==1 || n==1) return 1;
        return paths(m-1, n) + paths(m, n-1);
    }
    static void main() {
        int m = 4, n = 5;
        System.out.println(paths(m,n));
    }
}