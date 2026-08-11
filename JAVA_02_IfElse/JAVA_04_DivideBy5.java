package JAVA_02_IfElse;
import java.util.Scanner;
public class JAVA_04_DivideBy5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n%5 == 0) System.out.println("Divisible by 5");
        else System.out.println("Not Divisible by 5");
    }
}