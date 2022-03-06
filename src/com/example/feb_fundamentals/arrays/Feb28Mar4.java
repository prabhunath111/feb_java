package com.example.feb_fundamentals.arrays;

import java.util.Scanner;

public class Feb28Mar4 {
    public static void main(String[] args){
        int[] myArray = {10, 23, 8, 15, 17, 25};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the searching element here and hit the Enter ");
        System.out.println();
        boolean isSuccess = false;
        int searchElement = scanner.nextInt();
        for(int i = 0; i < myArray.length; i++) {
            System.out.println(i);
            if(myArray[i] == searchElement){
                isSuccess = true;
                System.out.print("This is the First Index: "+ i);
                break;
            }
        }
        if(!isSuccess){
            System.out.print("Not found...");
        }
    }
}
