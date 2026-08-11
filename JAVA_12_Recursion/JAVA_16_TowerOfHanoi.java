package JAVA_12_Recursion;
public class JAVA_16_TowerOfHanoi {
    static int chance = 1;
    static void hanoi(int n, char a, char b, char c){
        if(n==0) return;
        hanoi(n-1, a, c, b);
        System.out.println((chance++)+" "+a+"->"+c);
        hanoi(n-1, b, a, c);;
    }
    static void main() {
        hanoi(3, 'A', 'B', 'C');
    }
}