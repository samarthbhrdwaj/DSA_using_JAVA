package JAVA_13_OOPs;
class Fraction{
    int num;
    int den;
    Fraction(int num, int den){
        this.num = num;
        this.den = den;
        simplify();
    }
    void print(){
        System.out.println(num+"/"+den);
    }
    void add(Fraction f){
        num = num * f.den + den * f.num;
        den = f.den * den;
        simplify();
    }
    void multiply(Fraction f){
        num = num * f.num;
        den = f.den * den;
        simplify();
    }
    void divide(Fraction f){
        num = num * f.den;
        den = den * f.num;
        simplify();
    }
    void simplify(){
        int hcf = gcd(num, den);
        num /= hcf;
        den /= hcf;
    }
    int gcd(int a, int b){
        if(a == 0) return b;
        return gcd(b%a, a);
    }
}
public class JAVA_05_Fraction {
    static void main() {
        Fraction f1 = new Fraction(3, 7);
        f1.print();
        Fraction f2 = new Fraction(7, 3);
        f2.print();
//        f1.add(f2);
        f1.multiply(f2);
//        f1.divide(f2);
        f1.print();
    }
}