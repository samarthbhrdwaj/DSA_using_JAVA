package JAVA_10_String;
import java.util.Arrays;
public class JAVA_12_Anagram {
    static void main() {
        String s1 = "anagram";
        String s2 = "nagaram";
        char[] ch1 = new char[s1.length()];
        for(int i=0; i<s1.length(); i++){
            ch1[i] = s1.charAt(i);
        }
        Arrays.sort(ch1);
        char[] ch2 = new char[s1.length()];
        for(int i=0; i<s2.length(); i++){
            ch2[i] = s2.charAt(i);
        }
        Arrays.sort(ch2);
        System.out.println(Arrays.equals(ch1, ch2));
    }
}