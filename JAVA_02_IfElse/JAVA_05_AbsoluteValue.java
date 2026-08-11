package JAVA_02_IfElse;
import java.util.Scanner;
public class JAVA_05_AbsoluteValue {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n < 0) n = -n;
        System.out.println(n);
    }
}