package JAVA_10_String;
public class JAVA_04_Palindrome {
    static void main() {
        String str = "markram";
        boolean status = true;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                status = false;
                break;
            }
        }
        if(status){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}