package com.bridgelabz.java_sorting;

public class QuickSort {
    public void quickSort(int[] arr,int low,int high){
        if(low<high){
            int pivotIndex=partition(arr,low,high);
            quickSort(arr,low,pivotIndex-1);
            quickSort(arr,pivotIndex+1,high);
        }
    }
    public int partition(int[] arr,int low, int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
    public void display(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        QuickSort obj = new QuickSort();

        int[] arr = {4, 2, 7, 3, 1, 6};

        obj.quickSort(arr, 0, arr.length - 1);

        obj.display(arr);
    }
}
