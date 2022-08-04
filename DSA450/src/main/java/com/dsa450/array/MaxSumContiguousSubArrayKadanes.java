package com.dsa450.array;

public class MaxSumContiguousSubArrayKadanes {
    public static void main(String[] args) {
        MaxSumContiguousSubArrayKadanes obj = new MaxSumContiguousSubArrayKadanes();
        int[] input = {-2, -3, 4, -1, -2, 1, 5, -3};
        obj.kadane(input);
    }
    public void kadane(int[] arr){

        int max = Integer.MIN_VALUE;
        int curr_sum = 0;

        for(int i=0; i<arr.length;i++){

            curr_sum = curr_sum + arr[i];
            if (curr_sum > max){
                max = curr_sum;
            }
            if (curr_sum < 0){
                curr_sum =0;
            }
        }
        System.out.println("max sum is:" + max);
    }
}
