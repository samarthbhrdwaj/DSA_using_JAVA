package JAVA_03_Loops;
import java.util.Scanner;
public class JAVA_07_Table {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(i*n);
        }
    }
}