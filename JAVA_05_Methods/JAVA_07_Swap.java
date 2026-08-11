package JAVA_05_Methods;
import java.util.Scanner;
public class JAVA_07_Swap {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter another number: ");
        int b = sc.nextInt();
        System.out.println("Before Swapping - a: "+a+" b: "+b);
        a = b + a - (b = a);
        System.out.println("After Swapping - a: "+a+" b: "+b);
    }
}