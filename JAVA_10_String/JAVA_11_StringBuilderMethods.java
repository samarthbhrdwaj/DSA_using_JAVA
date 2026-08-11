package JAVA_10_String;
public class JAVA_11_StringBuilderMethods {
    static void main() {
        StringBuilder sb = new StringBuilder("programming");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.deleteCharAt(1);
        System.out.println(sb);
        sb.insert(1, 'n');
        System.out.println(sb);
    }
}