package com.bridgelabz.java_sorting;

public class SelectionSort {
    public void selectionSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }

            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
    }
    public void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {

        SelectionSort obj = new SelectionSort();

        int[] arr = {64, 25, 12, 22, 11};

        obj.selectionSort(arr);

        obj.display(arr);
    }
}
