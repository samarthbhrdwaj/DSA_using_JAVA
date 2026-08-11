package JAVA_04_PatternPrinting;
import java.util.Scanner;
public class JAVA_33_Bridge {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for(int i=1; i<=2*n-1; i++){
            System.out.print("* ");
        }
        System.out.println();
        for(int i=1; i<=n-1; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("* ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=n-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}