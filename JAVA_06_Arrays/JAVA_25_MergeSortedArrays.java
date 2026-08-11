package JAVA_06_Arrays;
public class JAVA_25_MergeSortedArrays {
    static void main() {
        int[] a = {0};
        int[] b = {1};
        int m = 0, n = 1;
        int[] c = new int[m+n];
        int i=0, j=0, k=0;
        while(i<m && j<n){
            if(a[i] <= b[j]) c[k++] = a[i++];
            else if(a[i] > b[j]) c[k++] = b[j++];
        }
        while(i<m) c[k++] = a[i++];
        while(j<n) c[k++] = b[j++];
        for(int ele : c) System.out.print(ele+" ");
    }
}