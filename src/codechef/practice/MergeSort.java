package codechef.practice;

public class MergeSort {

    public static void main(String args[]) {
        int a[] = {6,5,4,3,2,1};
        int p = 0;
        int r = a.length-1;
        mergesort(a,p,r);
    }

    static void mergesort(int a[],int p,int r){
        while(p<r){
            int q=(p+r)/2;
            mergesort(a,p,q);
            mergesort(a,q+1,r);
            merge(a,p,q,r);
        }
    }

    static void merge(int a[],int p, int q,int r){
        int l1 = q-p+1;
        int first[]=new int[q-p+1];
        int second[] = new int[r-q];
        for(int i=0;i<l1;i++){
            first[i]=a[p+i-1];
        }
        first[l1]=Integer.MAX_VALUE;
        for(int i=0;i<l1;i++){
            second[i]=a[p+i];
        }
    }
}
