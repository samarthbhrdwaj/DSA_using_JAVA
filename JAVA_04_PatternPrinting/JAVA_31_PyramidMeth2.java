package JAVA_04_PatternPrinting;
import java.util.Scanner;
public class JAVA_31_PyramidMeth2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int nsp = n-1, nst = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=nsp; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=nst; j++){
                System.out.print("* ");
            }
            System.out.println();
            nsp--;
            nst+=2;
        }
    }
}