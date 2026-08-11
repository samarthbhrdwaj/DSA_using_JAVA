package JAVA_11_2DArray;
import java.util.ArrayList;
public class JAVA_12_PascalTriangle {
    static void main() {
        int n = 6;
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            arr.add(new ArrayList<>());
            for(int j=0; j<=i; j++){
                arr.get(i).add(j, 1);
            }
            for(int j=1 ;j<i; j++){
                arr.get(i).set(j, arr.get(i-1).get(j)+arr.get(i-1).get(j-1));
            }
        }
        System.out.println(arr);
    }
}