package JAVA_02_IfElse;
import java.util.Scanner;
public class JAVA_13_AreaPerimeter {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the rectangle: ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth of the rectangle: ");
        double b = sc.nextDouble();
        double area = l * b;
        double perimeter = 2 * (l + b);
        if(area > perimeter) System.out.println("Area is greater");
        else System.out.println("Perimeter is greater");
    }
}