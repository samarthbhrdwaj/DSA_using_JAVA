package JAVA_10_String;
public class JAVA_06_IntToString {
    static void main() {
        int n = 125;
        String str = n+"";
        String str2 = Integer.toString(n);
        System.out.println(str);
        System.out.println(str2);

        String num = "123456";
        int number = Integer.parseInt(num);
        System.out.println(number+1);
    }
}