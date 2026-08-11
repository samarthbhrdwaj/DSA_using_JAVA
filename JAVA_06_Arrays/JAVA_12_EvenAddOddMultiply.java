package JAVA_06_Arrays;
public class JAVA_12_EvenAddOddMultiply {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        print(arr);
        for(int i=0; i<arr.length; i++){
            if(i%2 == 0) arr[i] += 10;
            else arr[i] *= 2;
        }
        print(arr);
    }
    static void print(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}