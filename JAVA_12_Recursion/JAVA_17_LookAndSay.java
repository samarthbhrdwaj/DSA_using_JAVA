package JAVA_12_Recursion;
public class JAVA_17_LookAndSay {
    static String lookAndSay(int n){
        if(n==1) return "1";
        String s = lookAndSay(n-1);
        String ans = "";
        int i=0, j=0;
        while(j<s.length()){
            if(s.charAt(i) == s.charAt(j)) j++;
            else{
                int freq = j-i;
                ans += freq;
                ans += s.charAt(i);
                i = j;
            }
        }
        int freq = j-i;
        ans += freq;
        ans += s.charAt(i);
        return ans;
    }
    static void main() {
        int n = 6;
        System.out.println(lookAndSay(n));
    }
}