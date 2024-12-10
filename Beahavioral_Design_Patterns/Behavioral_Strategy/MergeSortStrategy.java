package Behavioral_Strategy;

public class MergeSortStrategy implements SortingStrategy{
    @Override
    public void sort(int[] arr) {
        mergeSort(arr);
    }
    private static void mergeSort(int arr[]){
        if (arr.length<=1)
            return;
        int mid=arr.length/2;
        int left[]=new int[mid];
        int right[]=new int[arr.length-mid];

        for(int i=0;i<mid;i++){
            left[i]=arr[i];
        }
        for (int i=0; i<arr.length-mid;i++){
            right[i]=arr[mid+i];
        }
        mergeSort(right);
        mergeSort(left);
        merge(right,left,arr);

    }
    private static void merge(int right[], int left[],int arr[]){
        int k=0,r=0,l=0;
        while (right.length>r && left.length>l){
            if(right[r]<left[l]){
                arr[k]=right[r];
                k++;r++;
            }
            else {
                arr[k]=left[l];
                k++;l++;
            }
        }
        while (l< left.length){
            arr[k]=left[l];
            k++;l++;
        }
        while (r< right.length){
            arr[k]=right[r];
            k++;r++;
        }
    }
}
