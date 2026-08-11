package JAVA_12_Recursion;
import java.util.Scanner;
public class JAVA_05_Factorial {
    static int factorial(int n){
        if(n == 0 || n == 1) return 1;
        return n * factorial(n-1);
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int fact = factorial(n);
        System.out.println(fact);
    }
}