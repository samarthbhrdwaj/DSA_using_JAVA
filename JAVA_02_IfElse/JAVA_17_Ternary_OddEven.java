package JAVA_02_IfElse;
import java.util.Scanner;
public class JAVA_17_Ternary_OddEven {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println((n%2 == 0) ? "Even" : "Odd");
    }
}