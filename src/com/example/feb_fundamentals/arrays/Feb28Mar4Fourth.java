package com.example.feb_fundamentals.arrays;

public class Feb28Mar4Fourth {
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5,6,7,8};
        int[] newArray = afterSwap(myArray, 0, 7);
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(newArray[i]+" ");
        }
    }
    public static int[] afterSwap(int[] arr, int index1, int index2){
        int a = arr[index2];
        arr[index2] = arr[index1];
        arr[index1] = a;
        return arr;
    }
}
