package JAVA_02_IfElse;
import java.util.Scanner;
public class JAVA_03_OddEven {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n%2 == 0) System.out.println("Even Number");
        else System.out.println("Odd Number");
    }
}