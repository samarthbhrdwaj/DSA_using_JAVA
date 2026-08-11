package JAVA_02_IfElse;
import java.util.Scanner;
public class JAVA_14_Quadrant {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter coordinate of X: ");
        double x = sc.nextDouble();
        System.out.print("Enter coordinate of Y: ");
        double y = sc.nextDouble();
        if(x > 0 && y > 0) System.out.println("1st Quadrant");
        else if(x < 0 && y > 0) System.out.println("2nd Quadrant");
        else if(x < 0 && y < 0) System.out.println("3rd Quadrant");
        else if(x > 0 && y < 0) System.out.println("4th Quadrant");
        else if(x == 0 && y != 0) System.out.println("At X-Axis");
        else if(x != 0 && y == 0) System.out.println("At Y-Axis");
        else System.out.println("At Origin");
    }
}