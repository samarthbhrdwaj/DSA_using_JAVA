package JAVA_11_2DArray;
public class JAVA_03_Max {
    static void main() {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 5, 4}, {3, 2, 1, 10}};
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
}