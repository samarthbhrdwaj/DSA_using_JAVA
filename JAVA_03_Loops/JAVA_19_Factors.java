package JAVA_03_Loops;
import java.util.Scanner;
public class JAVA_19_Factors {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for(int i=1; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                if(i == n/i) {
                    System.out.println(i);
                    continue;
                }
                System.out.println(i);
                System.out.println(n/i);
            }
        }
    }
}