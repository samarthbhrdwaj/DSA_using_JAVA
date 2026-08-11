package JAVA_02_IfElse;
import java.util.Scanner;
public class JAVA_06_IsInt {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
//        boolean num = sc.hasNextInt();
//        System.out.println(num);

        double n = sc.nextDouble();
        int x = (int)n;
        if(n-x != 0) System.out.println("Not an Integer");
        else System.out.println("Integer");
    }
}