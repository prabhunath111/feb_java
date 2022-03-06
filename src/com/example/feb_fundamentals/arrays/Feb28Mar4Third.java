package com.example.feb_fundamentals.arrays;

public class Feb28Mar4Third {
    public static void main(String[] args){
        int[] firstArray = {2,4,2,0,3};
        int[] secondArray = {5,2,4,0,9};
        int count = 0;
        int[] diffArray = new int[5];
        for(int i = 0; i < firstArray.length;i++){
            boolean isFound = false;
            for(int j = 0; j < secondArray.length; j++) {
                if(firstArray[i] == secondArray[j]){
                    isFound = true;
                    break;
                }
            }
            if(isFound){

            }else{
                diffArray[count] = firstArray[i];
                count++;
            }
        }
        for(int l = 0; l< count;l++){
            System.out.println(diffArray[l]);
        }
    }
}
