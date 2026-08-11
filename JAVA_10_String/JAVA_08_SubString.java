package JAVA_10_String;;
public class JAVA_08_SubString {
    static void main() {
        String str = "samarth";
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<=str.length(); j++){
                System.out.print(str.substring(i, j)+" ");
            }
            System.out.println();
        }
    }
}