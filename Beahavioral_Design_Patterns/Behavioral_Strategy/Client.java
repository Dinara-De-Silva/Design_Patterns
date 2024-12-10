package Behavioral_Strategy;

import java.util.Arrays;

public class Client {

    public static void main(String Arg[]){

        int arr[]={12,1,19924,5,66,97,-3,42,0,-9,78,101,2,0,23,-2,144,220098,73};
        SortingContext sortingContext = new SortingContext(new BubbleSortStrategy());

        int arr1[]= Arrays.copyOf(arr,arr.length);
        sortingContext.sortArr(arr1);
        for (int i:arr1){
            System.out.print(i+" ");
        }
        System.out.println();
        sortingContext.setStrategy(new QuickSortStrategy());
        sortingContext.sortArr(arr);
        for (int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

}
