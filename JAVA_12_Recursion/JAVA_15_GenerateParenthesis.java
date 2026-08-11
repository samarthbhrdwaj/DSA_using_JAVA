package JAVA_12_Recursion;
import java.util.*;
public class JAVA_15_GenerateParenthesis {
    static void generate(int n, int l, int r, String s, List<String> res){
        if(r==n){
            res.add(s);
            return;
        }
        if(l < n) generate(n, l+1, r, s+"(", res);
        if(r < l) generate(n, l, r+1, s+")", res);
    }
    static void main() {
        List<String> res = new ArrayList<>();
        int n = 3;
        generate(n, 0, 0, "", res);
        System.out.println(res);
    }
}