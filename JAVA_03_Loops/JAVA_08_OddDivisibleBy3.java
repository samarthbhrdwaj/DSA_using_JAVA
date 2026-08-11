package JAVA_03_Loops;
public class JAVA_08_OddDivisibleBy3 {
    static void main() {
        for(int i=1; i<=100; i+=2){
            if(i%3 == 0) System.out.print(i+" ");
        }
    }
}