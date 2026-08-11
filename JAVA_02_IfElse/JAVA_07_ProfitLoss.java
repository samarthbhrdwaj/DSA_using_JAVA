package JAVA_02_IfElse;
import java.util.Scanner;
public class JAVA_07_ProfitLoss {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price of an Item: ");
        double cp = sc.nextDouble();
        System.out.print("Enter Sell price of an Item: ");
        double sp = sc.nextDouble();
        if(sp > cp) System.out.println("Profit of Rs: "+(sp-cp)+" and percent is: "+(sp-cp)/cp*100+"%");
        else if(cp > sp) System.out.println("Loss of Rs: "+(cp-sp)+" and percent is: "+(cp-sp)/cp*100+"%");
        else System.out.println("No Profit, no Loss");
    }
}