package com.dsa450.array;

public class DutchFlag {

    public static void main(String[] args) {
        DutchFlag dutchFlag = new DutchFlag();
        int[] input = {0, 1, 2, 0, 1, 2};
        dutchFlag.dutchFlagImpl(input);

    }
    public void dutchFlagImpl(int[] input){

        int len = input.length;
        int low=0; int mid =0; int high = len -1;

        while (mid <= high){

            switch (input[mid]){

                case 0:{
                    int temp = input[mid];
                    input[mid] = input[low];
                    input[low] = temp;

                    mid++;
                    low++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    int temp = input[mid];
                    input[mid] = input[high];
                    input[high] = temp;

                    high--;
                    break;
                }

            }
        }

        for (int i=0; i< len;i++){
            System.out.println(input[i]);
        }

    }
}
