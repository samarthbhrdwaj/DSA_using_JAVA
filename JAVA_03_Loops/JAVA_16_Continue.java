package JAVA_03_Loops;
public class JAVA_16_Continue {
    static void main() {
        for(int i=0; i<=10; i++){
            if(i == 4 || i == 8) continue;
            System.out.println(i);
        }
    }
}