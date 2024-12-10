package Behavioral_Strategy;

public class InsertionSortStrategy implements SortingStrategy{
    @Override
    public void sort(int[] arr) {
        insertionSort(arr);
    }
    private static void insertionSort(int arr[]){
        int current;
        int len = arr.length;
        for(int i=1;i<len;i++){
            current=arr[i];
            int j=i-1;
            while( j>=0 && current<arr[j] ) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1]=current;
        }
    }
}
