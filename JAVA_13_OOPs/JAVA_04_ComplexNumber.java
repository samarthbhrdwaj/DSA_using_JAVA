package JAVA_13_OOPs;
class Complex{
    int real;
    int imaginary;
    Complex(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    void print(){
        if(imaginary>0) System.out.println(real+" + "+imaginary+"i");
        else System.out.println(real+" - "+imaginary*-1+"i");
    }
    void add(Complex c){
        real += c.real;
        imaginary += c.imaginary;
    }
    void multiply(Complex c){
        real = real*c.real - imaginary*c.imaginary;
        imaginary = real*c.imaginary + imaginary*c.real;
    }
}
public class JAVA_04_ComplexNumber {
    static void main() {
        Complex c1 = new Complex(1, 2);
        Complex c2 = new Complex(3, 4);
        c1.print(); c2.print();
        c1.add(c2);
        c1.print(); c2.print();
        c1.multiply(c2);
        c1.print(); c2.print();
    }
}
