//https://youtu.be/mB5HXBb_HY8?si=QETrJpqhy2XT75vT -abdul bari
//https://youtu.be/hPzlKHFc3Y4?si=5NuXzRqeG7lxsWvT - Telusko -I found this easy 
//divide into small arrays until single element ,follow divide and conquer
//single element no need to sort .
//time complexity -nlogn
//use median in merge sort ((first + last index)//2)
package ArraySearSort;

public class mergesort {

    public static void mergesort(int arr[], int l , int r ){  //l=left , r= right
        if(l<r){
            int mid = (l+r)/2;
            mergesort(arr,l,mid);
            mergesort(arr,mid+1,r);
            
            merge(arr ,l,mid ,r);
        }

    }
    public static void merge(int[] arr,int l ,int mid,int r){
        int lArr[]=new int[];
        int rArr[]=new int[];
    }
    public static void main(String[] args){
        int arr[] = {3,5,1,4,6,2};
        for(int n:arr){
            System.out.print(n + " ");
        }
            System.out.println();

            mergesort(arr , 0,arr.length-1);

            System.out.println("after sorting");
            for(int n :arr){
                System.out.println(n + " ");
            }
    }
    
}
