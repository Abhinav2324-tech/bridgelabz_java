package com.bridgelabz.java_sorting;

public class BubbleSort {
    public void bubbleSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public void display(int[] arr){
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        BubbleSort obj = new BubbleSort();

        int[] arr = {6, 3, 8, 4, 2};

        obj.bubbleSort(arr);

        obj.display(arr);
    }
    }
