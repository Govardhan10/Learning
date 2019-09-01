package codechef.practice;

public class RecursionInsertion {

    public static void main(String args[]){

        int a[]={6,5,4,3,2,1};

        insertion(a,a.length-1);

        for(int x:a){
            System.out.println(x);
        }

    }

    private static void insertion(int a[],int index){

        if(index>0){
            insertion(a,index-1);
            insert(a,index);
        }
    }

    private static void insert (int a[],int index){
        int key=a[index];
        int i=index-1;
        while(i>=0 && a[i]>key){
            a[i+1]=a[i];
            i--;
        }
        a[i+1]=key;
    }
}
