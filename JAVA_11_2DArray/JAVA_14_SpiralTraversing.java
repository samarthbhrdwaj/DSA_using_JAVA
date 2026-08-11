package JAVA_11_2DArray;
public class JAVA_14_SpiralTraversing {
    static void main() {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int fr = 0;
        int lr = arr.length-1;
        int fc = 0;
        int lc = arr[0].length-1;
        while(fr<=lr && fc<=lc){
        for(int j=fc; j<=lc; j++){
            System.out.print(arr[fr][j]+" ");
        }
        fr++;
        for(int i=fr; i<=lr; i++){
            System.out.print(arr[i][lc]+" ");
        }
        lc--;
        for(int j=lc; j>=fc; j--){
            System.out.print(arr[lr][j]+" ");
        }
        lr--;
        for(int i=lr; i>=fr; i--){
            System.out.print(arr[i][fc]+" ");
        }
        fc++;
        }
    }
}