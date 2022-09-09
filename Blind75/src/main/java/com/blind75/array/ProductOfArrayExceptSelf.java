package com.blind75.array;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        ProductOfArrayExceptSelf obj = new ProductOfArrayExceptSelf();
        int[] input = {1,2,3,4};
        // -1,1,0,-3,3
        // -1,1,0,-3,3,0
        int[] result = obj.productOfArray(input);
        for (int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
    public int[] productOfArray(int[] nums){

        int product = 1;
        int numofZeros = 0;

        int[] result = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if (nums[i] == 0){
                numofZeros ++;
            }
        }
        if (numofZeros == 0){
            for (int i =0;i<nums.length;i++){
                product = product * nums[i];
            }
            for (int i =0;i<nums.length;i++){
                result[i] = product/nums[i];
            }

        }else if (numofZeros == 1){

            for (int i =0;i<nums.length;i++){
                if (nums[i] != 0){
                    product = product * nums[i];
                }

            }
            for (int i =0;i<nums.length;i++){
                if(nums[i] == 0){
                    result[i] = product;
                }else {
                    result[i] =0;
                }
            }
            return result;
        }else {
            for (int i=0; i< nums.length;i++){
                result[i] =0;
            }
        }
        return result;
    }


}
