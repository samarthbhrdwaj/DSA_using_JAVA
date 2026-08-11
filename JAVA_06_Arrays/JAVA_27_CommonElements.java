package JAVA_06_Arrays;
import java.util.*;
public class JAVA_27_CommonElements {
    static void main() {
        int[] a = {3, 4, 2, 2, 4};
        int[] b = {3, 2, 2, 7};
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0, j=0;
        ArrayList<Integer> result = new ArrayList<>();
        while(i<a.length && j<b.length){
            if(a[i] == b[j]){
                result.add(a[i]);
                i++;
                j++;
            }
            else{
                if(a[i] < b[j]) i++;
                else if(a[i] > b[j]) j++;
            }
        }
        System.out.println(result);
    }
}
