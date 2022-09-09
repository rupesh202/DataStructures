package com.blind75.array;

/*
Given an integer array nums, find a contiguous non-empty subarray within the array that has the largest product, and return the product.

The test cases are generated so that the answer will fit in a 32-bit integer.

A subarray is a contiguous subsequence of the array.

https://leetcode.com/problems/maximum-product-subarray/
 */
public class MaxProductSubarray {
    public static void main(String[] args) {
        MaxProductSubarray obj = new MaxProductSubarray();
        int[] input = {-2,3,-4};

        System.out.println(obj.maxProduct(input));
    }
    public int maxProduct(int[] arr){

        // max positive product
        // ending at the current position
        int max_ending_here = arr[0];

        // min negative product ending
        // at the current position
        int min_ending_here = arr[0];

        // Initialize overall max product
        int max_so_far = arr[0];

        // /* Traverse through the array.
        // the maximum product subarray ending at an index
        // will be the maximum of the element itself,
        // the product of element and max product ending previously
        // and the min product ending previously. */
        for(int i=1;i<arr.length;i++){
            int temp = Math.max(Math.max(arr[i], arr[i] * max_ending_here), arr[i] * min_ending_here);
            min_ending_here = Math.min(Math.min(arr[i], arr[i] * max_ending_here), arr[i] * min_ending_here);
            max_ending_here = temp;
            max_so_far = Math.max(max_so_far, max_ending_here);
        }

        return max_so_far;


    }

}
