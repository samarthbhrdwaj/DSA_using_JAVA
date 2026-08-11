package JAVA_02_IfElse;
import java.util.Scanner;
public class JAVA_15_GreatestOf3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int n2 = sc.nextInt();
        System.out.print("Enter number 3: ");
        int n3 = sc.nextInt();
        if(n1 >= n2 && n1 >= n3) System.out.println("Greatest is: "+n1);
        else if(n2 >= n1 && n2 >= n3) System.out.println("Greatest is: "+n2);
        else System.out.println("Greatest is: "+n3);
    }
}