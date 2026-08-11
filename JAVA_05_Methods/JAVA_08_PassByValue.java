package JAVA_05_Methods;
public class JAVA_08_PassByValue {
    static void main() {
        int n = 10;
        System.out.println(n);
        change(n);
        System.out.println(n);
    }
    static void change(int n){
        n = 50;
    }
}
