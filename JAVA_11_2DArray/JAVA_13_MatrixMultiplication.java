package JAVA_11_2DArray;
public class JAVA_13_MatrixMultiplication {
    static void main() {
        int[][] mat1 = {{7, 8},
                        {2, 9}};
        int[][] mat2 = {{14, 5},
                        {5, 18}};
        int m = mat1.length;
        int n = mat1[0].length;
        int p = mat2[0].length;
        int[][] mat3 = new int[m][p];
        for(int i=0; i<m; i++){
            for(int j=0; j<p; j++){
                for(int k=0; k<n; k++){
                    mat3[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        for(int[] list : mat3){
            for(int ele : list){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}