package JAVA_02_IfElse;
import java.util.Scanner;
public class JAVA_12_DivisibleBy3_5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n%3 == 0 && n%5 == 0) System.out.println("Divisible By 3 and 5");
        else if(n%3 == 0) System.out.println("Divisible By 3");
        else if(n%5 == 0) System.out.println("Divisible By 5");
        else System.out.println("Not divisible by 3 or 5");
    }
}