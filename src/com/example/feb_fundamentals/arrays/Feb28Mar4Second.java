package com.example.feb_fundamentals.arrays;

import java.util.Scanner;

public class Feb28Mar4Second {
    public static void main(String[] args) {
        int[] myArray = {1,3,4,9,2,2,9,10,1,2,1};
        boolean isSuccess = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int searchElement = scanner.nextInt();
        for(int i = myArray.length-1; i >= 0; i--){
            if(myArray[i] == searchElement){
                isSuccess = true;
                System.out.println("Found at index "+i);
                break;
            }
        }
        if(!isSuccess){
            System.out.print("Not found...");
        }
    }
}
