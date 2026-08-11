package JAVA_10_String;
public class JAVA_05_BuiltInMethods {
    static void main() {
        String str = "Programming Language";
        String a = "Java";
        String b = "java";

        System.out.println(str.indexOf('m'));
        System.out.println(str.lastIndexOf('m'));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.contains("mming"));
        System.out.println(str.startsWith("Prog"));
        System.out.println(str.endsWith("Prog"));
        System.out.println(a.compareTo(b));
        System.out.println(a.concat(str));
        System.out.println(str.substring(1));
    }
}