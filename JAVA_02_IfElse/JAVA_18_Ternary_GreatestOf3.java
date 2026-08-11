package JAVA_02_IfElse;
import java.util.Scanner;
public class JAVA_18_Ternary_GreatestOf3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter number 2: ");
        int b = sc.nextInt();
        System.out.print("Enter number 3: ");
        int c = sc.nextInt();
        System.out.println("Greatest is: "+ ((a>b)?((a>c)?a:c):((b>c)?b:c)));
    }
}