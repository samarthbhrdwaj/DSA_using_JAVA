package JAVA_04_PatternPrinting;
import java.util.Scanner;
public class JAVA_19_StarPlus {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n%2 == 0) System.out.println("Not Possible");
        else{
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n; j++){
                    if(i == n/2+1 || j == n/2+1) System.out.print("* ");
                    else System.out.print("  ");
                }
                System.out.println();
            }
        }
    }
}