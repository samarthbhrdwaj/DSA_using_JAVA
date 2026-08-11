package JAVA_04_PatternPrinting;
import java.util.Scanner;
public class JAVA_16_TriangleAlphaHoriFlip {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
}