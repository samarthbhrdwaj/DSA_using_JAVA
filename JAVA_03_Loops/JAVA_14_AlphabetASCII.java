package JAVA_03_Loops;
public class JAVA_14_AlphabetASCII {
    static void main() {
        System.out.println("Capital Letters");
        for(char ch = 'A'; ch <= 'Z'; ch++){
            System.out.println(ch+" "+(int)ch);
        }
        System.out.println("Small Letters");
        for(char ch = 'a'; ch <= 'z'; ch++){
            System.out.println(ch+" "+(int)ch);
        }
    }
}