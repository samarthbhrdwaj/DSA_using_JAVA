package JAVA_11_2DArray;
public class JAVA_05_minFromMax {
    static void main() {
        int[][] arr = {{1, 2, 3, 400}, {5, 6, 7, 80}, {9, 10, 1, 2}};
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            int rowMax = Integer.MIN_VALUE;
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j] > rowMax){
                    rowMax = arr[i][j];
                }
            }
            if(min > rowMax){
                min = rowMax;
            }
        }
        System.out.println(min);
    }
}