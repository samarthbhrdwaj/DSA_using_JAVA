package JAVA_11_2DArray;
public class JAVA_09_ReverseRowCol {
    static void main() {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        for(int a=0; a<arr.length; a++){
            int i = 0, j= arr[0].length-1;
            while(i<=j){
                int temp = arr[a][i];
                arr[a][i] = arr[a][j];
                arr[a][j] = temp;
                i++;
                j--;
            }
        }
        for(int a=0; a<arr[0].length; a++){
            int i = 0, j= arr.length-1;
            while(i<=j){
                int temp = arr[i][a];
                arr[i][a] = arr[j][a];
                arr[j][a] = temp;
                i++;
                j--;
            }
        }
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}