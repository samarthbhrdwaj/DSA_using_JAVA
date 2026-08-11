package JAVA_11_2DArray;
public class JAVA_02_Sum {
    static void main() {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 6}, {5, 4, 3, 2}};
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
}