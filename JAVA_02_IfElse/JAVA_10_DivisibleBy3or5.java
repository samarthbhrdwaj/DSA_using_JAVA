package JAVA_02_IfElse;
import java.util.Scanner;
public class JAVA_10_DivisibleBy3or5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n%3 == 0 || n%5 == 0) System.out.println("Divisible by 3 or 5");
        else System.out.println("Not Divisible by 3 or 5");
    }
}