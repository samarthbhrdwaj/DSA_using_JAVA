package JAVA_11_2DArray;
public class JAVA_01_Basics {
    static void main() {
        int[][] arr = new int[4][5];
//        for(int i=0; i<4; i++){
//            for(int j=0; j<5; j++){
//                arr[i][j] = (i+1) * (j+1);
//            }
//        }
        for(int i=0; i<4; i++){
            for(int j=0; j<5; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}