package JAVA_03_Loops;
import java.util.Scanner;
public class JAVA_17_CompositeNo {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean status = false;
        for(int i=2; i<n; i++){
            if(n%i == 0){
                status = true;
                break;
            }
        }
        if(status) System.out.println("Given number is a Composite Number");
        else System.out.println("Given number is not a Composite Number");
    }
}