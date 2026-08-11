package JAVA_03_Loops;
import java.util.Scanner;
public class JAVA_18_PrimeNo {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean status = true;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                status = false;
                break;
            }
        }
        if(status) System.out.println("The Given number is a Prime Number");
        else System.out.println("The Given number is not a Prime Number");
    }
}