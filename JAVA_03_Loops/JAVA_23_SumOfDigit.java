package JAVA_03_Loops;
import java.util.Scanner;
public class JAVA_23_SumOfDigit {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n<0) n = -n;
        int sum = 0;
        while(n!=0){
            sum += n%10;
            n/=10;
        }
        System.out.println(sum);
    }
}