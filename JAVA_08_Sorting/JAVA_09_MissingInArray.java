package JAVA_08_Sorting;
public class JAVA_09_MissingInArray {
    static void main() {
        int[] arr = {2, 5, 3, 4};
        int n = arr.length+1;
        int i=0;
        while(i<arr.length){
            if(arr[i] == i+1 || arr[i] == n){
                i++;
            }
            else{
                int first = i;
                int second = arr[i]-1;
                int temp = arr[first];
                arr[first] = arr[second];
                arr[second] = temp;
            }
        }
        for(i=0; i<arr.length; i++){
            if(arr[i] != i+1){
                System.out.println(i+1);
                break;
            }
        }
    }
}