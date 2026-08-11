package JAVA_01_Basics;
public class JAVA_07_TSAOfCuboid {
    static void main() {
        double l = 10.5, b = 20.5, h = 30.5;
        double tsa = 2 * (l*b + b*h + h*l);
        System.out.println(tsa);
    }
}