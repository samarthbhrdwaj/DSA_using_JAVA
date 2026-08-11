package JAVA_03_Loops;
import java.util.Scanner;
public class JAVA_26_ReverseThenSum {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n;
        int rev = 0;
        while(temp!=0){
            rev = rev * 10 + temp %10;
            temp /= 10;
        }
        System.out.println("Original Number: "+n);
        System.out.println("Reverse Number: "+rev);
        System.out.println("Sum of Both: "+(n+rev));
    }
}