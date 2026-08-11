package JAVA_10_String;
import java.util.Scanner;
public class JAVA_02_Input {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str1 = sc.nextLine();
        System.out.println(str1);
        System.out.println("Enter a string: ");
        String str2 = sc.next();
        System.out.println(str2);
    }
}