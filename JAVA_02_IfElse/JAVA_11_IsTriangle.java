package JAVA_02_IfElse;
import java.util.Scanner;
public class JAVA_11_IsTriangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1 of triangle: ");
        int s1 = sc.nextInt();
        System.out.print("Enter side 2 of triangle: ");
        int s2 = sc.nextInt();
        System.out.print("Enter side 3 of triangle: ");
        int s3 = sc.nextInt();
        if( (s1+s2)>s3 && (s2+s3)>s1 && (s3+s1)>s2 ) System.out.println("It is a Triangle");
        else System.out.println("Not a Triangle");
    }
}