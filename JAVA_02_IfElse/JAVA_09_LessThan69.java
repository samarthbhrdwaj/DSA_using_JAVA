package JAVA_02_IfElse;
import java.util.Scanner;
public class JAVA_09_LessThan69 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n < 0) n = -n;
        if(n < 69 ) System.out.println("Less than 69");
        else System.out.println("Greater than 69");
    }
}
