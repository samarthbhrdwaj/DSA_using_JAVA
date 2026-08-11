package JAVA_12_Recursion;
public class JAVA_12_RecursionOnArray {
//    static void recPrint(int[] arr, int idx){
//        if(idx == arr.length) return;
//        System.out.print(arr[idx]+" ");
//        recPrint(arr, idx+1);
//    }
    static boolean search(int[] arr, int idx, int ele){
        boolean status;
        if(idx == arr.length) return false;
        if (arr[idx] == ele) return true;
        return search(arr, idx+1, ele);
    }
    static void main() {
        int[] arr = {8, 5, 2, 7, 4, 1, 9, 6, 3};
//        recPrint(arr, 0);
        System.out.println(search(arr, 0, 9));
    }
}