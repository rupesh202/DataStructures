package com.dsa450.array;

public class RotateArrayByK {
    public static void main(String[] args) {

        int[] input = {1,2,3,4,5,6};
        int k =2;
        RotateArrayByK obj = new RotateArrayByK();
        obj.rotateLeft(input,k);
    }
    public void rotateLeft(int[] input, int k){


        input = reverseArray(input,0, k-1);
        input = reverseArray(input,k,input.length-1);
        input = reverseArray(input, 0,input.length-1);



        for (int i=0; i< input.length; i++){
            System.out.println(input[i]);
        }

    }
    public int[] reverseArray(int[] input, int start, int end){

        while (start < end){
            int temp = input[start];
            input[start] = input[end];
            input[end] = temp;
            start++;
            end--;
        }
        return input;
    }
}
