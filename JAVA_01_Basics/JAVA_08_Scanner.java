package JAVA_01_Basics;
import java.util.Scanner;
public class JAVA_08_Scanner {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double d = sc.nextDouble();
        System.out.println(d);
    }
}