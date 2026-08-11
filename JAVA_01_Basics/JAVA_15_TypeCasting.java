package JAVA_01_Basics;
public class JAVA_15_TypeCasting {
    static void main() {
        char ch = 'A';
        int x = ch;
        System.out.println(ch+" "+x);

        char ch1 = 'a';
        int x1 = (int)ch1;
        System.out.println(ch1+" "+x1);

        int n = 100;
        System.out.println((char)n);
    }
}