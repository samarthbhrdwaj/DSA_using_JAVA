package JAVA_10_String;
public class JAVA_07_StringToChar {
    static void main() {
        String str = "Programming";
        char[] ch = str.toCharArray();
        for(char ele :ch){
            System.out.print(ele+" ");
        }
        System.out.println();
        System.out.println(str.substring(3, 7));
    }
}