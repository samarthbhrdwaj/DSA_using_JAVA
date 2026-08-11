package JAVA_04_PatternPrinting;
import java.util.Scanner;
public class JAVA_08_SquareAlphabet03 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i%2 == 1) System.out.print((char)(i+96)+" ");
                else System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }
    }
}