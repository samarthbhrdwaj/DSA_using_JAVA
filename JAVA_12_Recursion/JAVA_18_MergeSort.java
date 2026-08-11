package JAVA_12_Recursion;
public class JAVA_18_MergeSort {
    static void mergeSort(int[] arr){
        int n = arr.length;
        if(n==1) return;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        int idx = 0;
        for(int i=0; i<a.length; i++) a[i] = arr[idx++];
        for(int i=0; i<b.length; i++) b[i] = arr[idx++];
        mergeSort(a);
        mergeSort(b);
        merge(a, b, arr);
    }
    static void merge(int[] a, int[] b, int[] arr){
        int i=0, j=0, k=0;
        while(i<a.length && j<b.length){
            if(a[i] <= b[j]) arr[k++] = a[i++];
            else arr[k++] = b[j++];
        }
        while(i<a.length) arr[k++] = a[i++];
        while(j<b.length) arr[k++] = b[j++];
    }
    static void main() {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        for(int ele : arr) System.out.print(ele+" ");
        System.out.println();
        mergeSort(arr);
        for(int ele : arr) System.out.print(ele+" ");
    }
}