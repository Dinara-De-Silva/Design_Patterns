package Behavioral_Strategy;

public class QuickSortStrategy implements SortingStrategy{
    @Override
    public void sort(int[] arr) {
        quickSort(0, arr.length-1,arr);
    }
    private static void quickSort(int l,int r,int arr[]){
        if (l<r){
            int x=partition(l,r,arr);
            quickSort(l,x-1,arr);
            quickSort(x+1,r,arr);
        }
    }

    private static int partition(int l, int r, int arr[]) {
        int pivot = arr[l];
        int i = l + 1;
        int j = r;

        while (i <= j) {
            while (i <= j && arr[i] <= pivot) {
                i++;
            }
            while (i <= j && arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++; // Move i to the next element
                j--; // Move j to the previous element
            }
        }
        arr[l] = arr[j];
        arr[j] = pivot;

        return j;
    }
}
