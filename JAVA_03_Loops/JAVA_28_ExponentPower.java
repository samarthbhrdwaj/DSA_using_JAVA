package JAVA_03_Loops;
import java.util.Scanner;
public class JAVA_28_ExponentPower {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of base: ");
        int base = sc.nextInt();
        System.out.print("Enter value of exponent: ");
        int exponent = sc.nextInt();
        int power = 1;
        for(int i=1; i<=exponent; i++){
            power *= base;
        }
        System.out.println(power);
    }
}