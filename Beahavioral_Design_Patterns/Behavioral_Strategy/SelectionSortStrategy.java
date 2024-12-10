package Behavioral_Strategy;

public class SelectionSortStrategy implements SortingStrategy{
    @Override
    public void sort(int[] arr) {
        selectionSort(arr);
    }
    private static void selectionSort(int arr[]){
        int minimum;
        int temp;
        int len = arr.length;
        for(int i=0;i<len-1;i++){
            minimum=i;
            for(int j=i+1;j<len;j++){
                if(arr[j]<arr[minimum]){
                    minimum=j;
                }
            }
            if (i!=minimum){
                temp=arr[i];
                arr[i]=minimum;
                arr[minimum]=temp;
            }

        }
    }
}
