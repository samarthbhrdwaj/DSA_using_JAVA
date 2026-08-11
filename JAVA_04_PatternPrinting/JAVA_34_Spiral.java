package JAVA_04_PatternPrinting;
import java.util.Scanner;
public class JAVA_34_Spiral {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for(int i=1; i<=n*2-1; i++){
            for(int j=1; j<=n*2-1; j++){
                int a = i, b = j;
                if(i > n) a = 2*n - i;
                if(j > n) b = 2*n - j;
                System.out.print(Math.min(a, b)+" ");
            }
            System.out.println();
        }
    }
}