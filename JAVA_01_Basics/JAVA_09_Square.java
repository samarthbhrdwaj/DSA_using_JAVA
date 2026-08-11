package JAVA_01_Basics;
import java.util.Scanner;
public class JAVA_09_Square {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double n = sc.nextDouble();
        double area = n * n;
        System.out.println(area);
    }
}