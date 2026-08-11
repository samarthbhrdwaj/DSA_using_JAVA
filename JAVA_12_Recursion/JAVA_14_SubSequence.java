package JAVA_12_Recursion;
public class JAVA_14_SubSequence {
    static void subSequence(String ans, String str, int idx){
        if(idx==str.length()){
            System.out.print(ans+" ");
            return;
        }
        char ch = str.charAt(idx);
        subSequence(ans, str, idx+1);
        subSequence(ans+ch, str, idx+1);
    }
    static void main() {
        String str = "abc";
        subSequence("", str, 0);
    }
}