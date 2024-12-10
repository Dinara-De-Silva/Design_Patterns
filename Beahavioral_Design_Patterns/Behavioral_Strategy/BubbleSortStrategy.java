package Behavioral_Strategy;

public class BubbleSortStrategy implements SortingStrategy{
    //private int arr[];
    @Override
    public void sort(int arr[]) {
        //this.arr=arr;
        bubbleSort(arr);
    }
    private static void bubbleSort(int arr[]){
        int temp;
        int len = arr.length;
        for(int i=0;i<len;i++){
            boolean isSwapped=false;
            for (int j=0;j<len-1-i;j++){
                if (arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSwapped=true;
                }
            }
            if(!isSwapped){
                break;
            }
        }
    }
}
