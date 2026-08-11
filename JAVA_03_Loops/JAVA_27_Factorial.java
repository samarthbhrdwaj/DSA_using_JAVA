package JAVA_03_Loops;
import java.util.Scanner;
public class JAVA_27_Factorial {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int fact = 1;
        for (int i=1; i<=n; i++){
            fact *= i;
        }
        System.out.println(fact);
    }
}