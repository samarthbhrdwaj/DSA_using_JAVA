package JAVA_03_Loops;
import java.util.Scanner;
public class JAVA_29_PerfectNo {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n<2){
            System.out.println("The number is not a perfect number");
        }
        else{
            int sum = 1;
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i == 0){
                    sum += i;
                    sum += n/i;
                }
            }
            if(sum == n){
                System.out.println("The number is a Perfect number");
            }
            else{
                System.out.println("The number is not a Perfect number");
            }
        }
    }
}