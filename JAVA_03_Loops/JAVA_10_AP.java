package JAVA_03_Loops;
import java.util.Scanner;
public class JAVA_10_AP {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
//        for(int i=2; i<=3*n-1; i+=3){
//            System.out.println(i);
//        }

        int a = 2, d = 3;
        for(int i=1; i<=n ;i++){
            System.out.println(a);
            a += d;
        }
    }
}