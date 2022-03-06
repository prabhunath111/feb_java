package com.example.feb_fundamentals.arrays;

public class Feb28Mar4SumOfElementsInArray {
    public static void main(String[] args) {
        int[] myArray = {1,21,22,32,987};
        System.out.print("Sum of all the elements in array is ");
        System.out.print(sumOfAllElement(myArray)+".");
    }
    public static int sumOfAllElement(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
