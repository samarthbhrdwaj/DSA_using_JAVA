package JAVA_12_Recursion;
public class JAVA_02_1ToN {

    static void print(int n){
        if(n==0) return;
        print(n-1);
        System.out.println(n);
    }
    static void main() {
        int n = 10;
        print(n);
    }

//    static void print(int n, int limit){
//        if(n > limit){
//            return;
//        }
//        System.out.println(n);
//        print(n+1, limit);
//    }
//    static void main() {
//        int n = 10;
//        print(1, n);
//    }

//    static int lim = 10;
//    static void print(int n){
//        if(n > lim) return;
//        System.out.println(n);
//        print(n+1);
//    }
//    static void main() {
//        print(1);
//    }

}