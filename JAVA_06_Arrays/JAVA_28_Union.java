package JAVA_06_Arrays;
import java.util.ArrayList;
public class JAVA_28_Union {
    static void main() {
        int[] a = {1, 4, 4, 5, 6};
        int[] b = {4};
        ArrayList<Integer> result = new ArrayList<>();
        int i=0, j=0;
        while(i<a.length && j<b.length){
            if(a[i] < b[j]){
                if(result.isEmpty() || result.get(result.size()-1) != a[i]){
                    result.add(a[i]);
                }
                i++;
            }
            else if(a[i] > b[j]){
                if(result.isEmpty() || result.get(result.size()-1) != b[j]){
                    result.add(b[j]);
                }
                j++;
            }
            else{
                if(result.isEmpty() || result.get(result.size()-1) != a[i]){
                    result.add(a[i]);
                }
                i++;
                j++;
            }
        }
        while(i<a.length){
            if(result.isEmpty() || result.get(result.size()-1) != a[i]){
                result.add(a[i]);
            }
            i++;
        }
        while(j<b.length){
            if(result.isEmpty() || result.get(result.size()-1) != b[j]){
                result.add(b[j]);
            }
            j++;
        }
        System.out.println(result);
    }
}