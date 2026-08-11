package JAVA_06_Arrays;
public class JAVA_08_OtherDataTypes {
    static void main() {
        double[] d = {0.23, 0.25, 0.56};
        float[] f = {0.23f, 0.56f};
        String[] str = {"Peter", "Steve"};
        char[] c = {'c', 'h', 'a', 'r'};
        for(int i=0; i<d.length; i++){
            System.out.print(d[i]+" ");
        }
        System.out.println();
        for(int i=0; i<f.length; i++){
            System.out.print(f[i]+" ");
        }
        System.out.println();
        for(int i=0; i<str.length; i++){
            System.out.print(str[i]+" ");
        }
        System.out.println();
        for(int i=0; i<c.length; i++){
            System.out.print(c[i]+" ");
        }
        System.out.println();
    }
}