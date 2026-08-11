package JAVA_03_Loops;
import java.util.Scanner;
public class JAVA_13_AlternateSequence {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for(int i=0; i<n/2; i++){
            System.out.println(i+1);
            System.out.println(n-i);
        }
        if(n%2 == 1) System.out.println(n/2+1);
    }
}