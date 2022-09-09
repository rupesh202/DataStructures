package com.blind75.array;

/*
Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:

[4,5,6,7,0,1,2] if it was rotated 4 times.
[0,1,2,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums of unique elements, return the minimum element of this array.

You must write an algorithm that runs in O(log n) time.

https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/


 */
public class MinInSortedRotatedArray {
    public static void main(String[] args) {
        MinInSortedRotatedArray obj = new MinInSortedRotatedArray();
        int[] input= {3,4,5,1,2};
        obj.minInRotated(input);
    }
    public int minInRotated(int[] nums){

        int n = nums.length;
        if (n == 1) return nums[0];
        int l = 0; int r = n-1;
        int result = nums[0];
        while (l<=r){

            if(nums[l] < nums[r]){
                result = Math.min(result,nums[l]);
                break;
            }
            int m = (l + r)/2;

            if(nums[l] <= nums[m]){
                // We are in left side and min is in right side
                l = m+1;
            }else{
                // We are in right side and min is in left side
                r = m-1;
            }
        }
        return result;
    }
}
