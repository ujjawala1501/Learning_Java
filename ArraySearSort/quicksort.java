//Pivot(central point) & partition (around pivot(main hero of array) we shuffle elements)
//there are ways to select pivot -> first elemetn ,last element , median , some random number.
//quick sort : select 1 pivot lets take last item as pivot , now keep comparing whose lower than pivot move it to left and greater towards right.
//In quick sort 3 variables are used 1)low(first el) 2)High(Last ele) 3)i = -1 (which helps swapping the values)
//this is not fastest //it follows divide and conquer 
//https://youtu.be/7h1s2SojIRw?si=mlc0JGDWSVjiqQ8c  (abdul bari explain)
//time complexity : nlogn 
//https://youtu.be/VNrF8ugTUkI?si=AzQ7kb8nQFLu3go1 -telusko explanation
//https://youtu.be/_C-ARJemnC0?si=4nts5VkFfEpVzwaH - telusko code 
package ArraySearSort;

public class quicksort {

    public static void quicksortm(int arr[] , int low , int high){
        if (low < high){
        int pi = partition(arr,low,high);
        quicksortm(arr,low,pi-1);
        quicksortm(arr,pi+1,high);
        }
    }

    
    public static int partition(int arr[],int low ,int high){
        int pivot = high;
        int i = low-1;

        for(int j = low;j<high;j++){
            if (arr[j]<pivot){
                i++;
                int temp = arr[j];
                arr[j] =arr[i];
                arr[i] =temp;

            }
        }
        int temp = arr[high];
        arr[high] = arr[i+1];
        arr[i+1] = temp;
        return i+1;
    }
    //Main Method which calls quicksort only once 
    public static void main(String[] args){
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length;
        quicksortm(arr,0,n-1);
        for (int num : arr){
            System.out.print(num+" ");
        }
    }
    
}
