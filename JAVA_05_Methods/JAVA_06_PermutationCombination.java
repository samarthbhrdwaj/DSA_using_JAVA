package JAVA_05_Methods;
import java.util.Scanner;
public class JAVA_06_PermutationCombination {
    static double factorial(double n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact *= i;
        }
        return fact;
    }
    static double permutation(double n, double r){
        return  factorial(n) / factorial(n-r);
    }
    static double combination(double n, double r){
        return factorial(n) / factorial(n-r) / factorial(r);
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre value of n: ");
        double n = sc.nextDouble();
        System.out.print("Enter value of r: ");
        double r = sc.nextDouble();
        System.out.println("Permutation is: "+permutation(n, r));
        System.out.println("Combination is: "+combination(n, r));
    }
}