package JAVA_04_PatternPrinting;
import java.util.Scanner;
public class JAVA_22_BinaryTriangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
//        for(int i=1; i<=n; i++){
//            if(i%2==1){
//                for(int j=1; j<=i; j++){
//                    if(j%2==0) System.out.print(0+" ");
//                    else System.out.print(1+" ");
//                }
//            }
//            else{
//                for(int j=1; j<=i; j++){
//                    if(j%2==0) System.out.print(1+" ");
//                    else System.out.print(0+" ");
//                }
//            }
//            System.out.println();
//        }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2 == 0) System.out.print(1+" ");
                else System.out.print(0+" ");
            }
            System.out.println();
        }
    }
}