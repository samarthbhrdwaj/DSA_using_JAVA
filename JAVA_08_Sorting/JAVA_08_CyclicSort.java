package JAVA_08_Sorting;
public class JAVA_08_CyclicSort {
    static void main() {
        int[] arr = {8, 6, 2, 5, 3, 4, 1, 7, 9, 0};
        int i=0;
        while(i<arr.length){
            if(arr[i] == i) i++;
            else{
                int first = i;
                int second = arr[i];
                int temp = arr[first];
                arr[first] = arr[second];
                arr[second] = temp;
            }
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}