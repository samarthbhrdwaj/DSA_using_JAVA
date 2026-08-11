package JAVA_10_String;
public class JAVA_01_StringBasics {
    static void main() {
        char[] arr = {'j', 'a', 'v', 'a'};
        for(char ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        String[] arr1 = {"Java", "Python", "C++", "C", "JavaScript"};
        for(String ele : arr1){
            System.out.print(ele+" ");
        }
        System.out.println();
        String str = "This is a String";
        System.out.println(str.charAt(10));
        System.out.println(str.length());
    }
}