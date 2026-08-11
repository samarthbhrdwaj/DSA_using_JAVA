package JAVA_06_Arrays;
import java.util.Scanner;
public class JAVA_13_Search {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean status = false;
        for(int i=1; i<arr.length; i++){
            if(n == arr[i]){
                status = true;
                break;
            }
        }
        if(status) System.out.println("Element found!");
        else System.out.println("Element not found!");
    }
}