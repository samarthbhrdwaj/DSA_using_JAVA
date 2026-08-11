package JAVA_05_Methods;
import java.util.Scanner;
public class JAVA_02_MaxOf3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter number 2: ");
        int b = sc.nextInt();
        System.out.print("Enter number 3: ");
        int c = sc.nextInt();
        System.out.println("Max is: "+Math.max(a, Math.max(b, c)));
        System.out.println("Min is: "+Math.min(a, Math.min(b, c)));
    }
}