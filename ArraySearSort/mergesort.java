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
        int n1 = mid-1+1;
        int n2 = r - mid; 
        int lArr[]=new int[n1]; //left array
        int rArr[]=new int[n2]; //right array

        for(int x=0;x<n1;x++){ //copying value from actual array,everytime the array splits in two and hence each time while sortign the 2 arrays are getting combined.
            lArr[x] = arr[l+x];
        }
        for(int x=0;x<n2;x++){ //copying value from actual array,everytime the array splits in two and hence each time while sortign the 2 arrays are getting combined.
            rArr[x] = arr[mid+1+x];
        }
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

/*
 Divide and Conquer
Merge Sort uses a divide-and-conquer approach to sort an array or list. It works by repeatedly breaking down the list into smaller sublists until each sublist contains only one element. Here's how it works:
Divide: If the list has more than one element, divide the list into two halves.
Conquer: Recursively sort the two halves.
Combine: Merge the two sorted halves back into one sorted list.
Example
Let's say we have the list: [5, 2, 4, 6, 1, 3, 2, 5]
Divide: Split the list in half:
Left half: [5, 2, 4, 6]
Right half: [1, 3, 2, 5]
Divide each half again:
Left half: [, , , ]
Right half: [1
, , , ]
 */