package JAVA_01_Basics;
import java.util.Scanner;
public class JAVA_12_SI {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle amount: ");
        double p = sc.nextDouble();
        System.out.print("Enter the rate: ");
        double r = sc.nextDouble();
        System.out.print("Enter the time: ");
        double t = sc.nextDouble();
        double si = p * r * t / 100;
        System.out.println(si);
    }
}