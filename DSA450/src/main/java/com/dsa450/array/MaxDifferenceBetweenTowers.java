package com.dsa450.array;

import java.util.Arrays;

public class MaxDifferenceBetweenTowers {
    public static void main(String[] args){

        int[] arr = { 7, 4, 8, 8, 8, 9 };
        int k =6;
        /*
        [4,7,8,8,8,9] 9 - 4 = 5
        [4,13,2,2,2,3] 13 -2 = 11
        []


         */
        MaxDifferenceBetweenTowers obj = new MaxDifferenceBetweenTowers();
        obj.getMaxDifference(arr,k);

    }
    public void getMaxDifference(int[] arr, int k){

        Arrays.sort(arr);
        int len = arr.length;
        int result = arr[len-1] - arr[0];
        int min =arr[0];
        int max = arr[len-1];

        for (int i=1; i<len; i++){

            if (arr[i] < 0){
                continue;
            }
            min = Math.min(arr[0]+k,arr[i]-k);
            max = Math.max(arr[len-1] -k, arr[i-1] +k);
            result = Math.min(result,max-min);

        }
        System.out.println(result);

    }
}
