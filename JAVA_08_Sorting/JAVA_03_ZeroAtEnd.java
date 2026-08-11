package JAVA_08_Sorting;
public class JAVA_03_ZeroAtEnd {
    static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static void main() {
        int[] arr = {2, 0, 5, 1, 6, 0, 8, 0, 3, 0};
        print(arr);

//        for(int i=0; i<arr.length-1; i++)
//            for(int j=0; j<arr.length-i-1; j++)
//                if(arr[j] == 0 && arr[j] != arr[j+1])
//                    arr[j] = arr[j+1] + arr[j] - (arr[j+1] = arr[j]);

        int j=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                arr[i] = arr[j] + arr[i] - (arr[j] = arr[i]);
                j++;
            }
        }

        print(arr);
    }
}