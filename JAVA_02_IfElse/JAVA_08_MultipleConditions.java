package JAVA_02_IfElse;
import java.util.Scanner;
public class JAVA_08_MultipleConditions {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n > 999 && n < 10000) System.out.println("4 digit number");
        else System.out.println("Not a 4 digit number");
    }
}