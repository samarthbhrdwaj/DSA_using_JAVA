package JAVA_03_Loops;
import java.util.Scanner;
public class JAVA_12_GP {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int a = 1, r = 2;
        for(int i=1; i<=10; i++){
            System.out.println(a);
            a *= r;
        }
    }
}