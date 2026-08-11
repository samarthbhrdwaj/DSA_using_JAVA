package JAVA_08_Sorting;
public class JAVA_10_DuplicateNumber {
    static void main() {
        int[] arr = {3, 3, 3, 3, 3};
        int i=0;
        while(i<arr.length){
            if(arr[i] == i+1) i++;
            else{
                if(arr[i] != arr[arr[i]+1]){
                    System.out.println(arr[i]);
                    break;
                }
                else{
                    int first = i;
                    int second = arr[i]+1;
                    int temp = arr[first];
                    arr[first] = arr[second];
                    arr[second] = temp;
                }
            }
        }
    }
}