package JAVA_04_PatternPrinting;
import java.util.Scanner;
public class JAVA_23_OddTriangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j*2-1+" ");
            }
            System.out.println();
        }
    }
}