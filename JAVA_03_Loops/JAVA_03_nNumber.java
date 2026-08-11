package JAVA_03_Loops;
import java.util.Scanner;
public class JAVA_03_nNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++){
            System.out.println(i);
        }
    }
}