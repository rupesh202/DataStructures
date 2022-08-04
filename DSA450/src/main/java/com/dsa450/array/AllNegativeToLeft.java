package com.dsa450.array;

public class AllNegativeToLeft {
    public static void main(String[] args) {
        int arr[] = {-12, 11, -13, 5, 6, -7, 5, -3, -6};
        AllNegativeToLeft obj = new AllNegativeToLeft();
        obj.allNegativeToLeft(arr);

    }

    public void allNegativeToLeft(int [] input){

        int low =0; int high = input.length -1;

        while (low <= high){

            if (input[low] < 0){
                low++;

            }else if (input[low] >= 0){
                int temp = input[low];
                input[low] = input[high];
                input[high] = temp;
                high--;
            }
        }
        for (int i=0; i<input.length; i++){
            System.out.println(input[i]);
        }
    }



}
