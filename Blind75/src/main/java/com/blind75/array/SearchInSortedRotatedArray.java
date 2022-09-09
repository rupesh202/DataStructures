package com.blind75.array;

/*
There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.

https://leetcode.com/problems/search-in-rotated-sorted-array/

Sol:
https://www.youtube.com/watch?v=U8XENwh8Oy8&t=3s


 */
public class SearchInSortedRotatedArray {
    public static void main(String[] args) {
        SearchInSortedRotatedArray obj = new SearchInSortedRotatedArray();
        int[] input = {4, 5, 6, 7, 0, 1, 2};int target = 0;
        int[] input1 = {3, 5, 1};int target1 = 3;
        int[] input2 ={4,5,6,7,8,1,2,3}; int target2 = 8;

        System.out.println(obj.search(input2, target2));

    }

    public int search(int[] nums, int target) {

        //[4,5,6,7,8,1,2,3]  // 8

        int l = 0; int r = nums.length -1;
        int result = -1;
        while (l <= r){

            int m = l + (r-l)/2;

            if(nums[m] == target){
                result = m;
            }

            // First check if the mid is in the left sorted part of array or right sorted part of array

            if(nums[m] >= nums[l]){
                // m is in the left sorted part of array
                // Now check if target is on left side or right side of m in this sorted array
                if (target > nums[m] || target < nums[l]){
                    l = m+1;
                }else{
                    r = m-1;
                }

            }else{

                if(target < nums[m] || target > nums[r]){
                    // search left
                    r = m-1;
                }else{
                    l = m+1;
                }
            }

        }
        return result;
    }
}
