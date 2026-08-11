package JAVA_10_String;
public class JAVA_10_StringBuilder {
    static void main() {
        StringBuilder sb = new StringBuilder("This is a StringBuilder");
        System.out.println(sb.capacity()+" "+sb.length());
        System.out.println(sb);
        sb.append(" not a String but treat as a string ");
        System.out.println(sb.capacity()+" "+sb.length());
        System.out.println(sb);
        sb.setCharAt(3, 'z');
        System.out.println(sb);
    }
}