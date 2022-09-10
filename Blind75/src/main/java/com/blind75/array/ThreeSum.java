package com.blind75.array;

import java.util.*;
/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

https://leetcode.com/problems/3sum/
sol:
https://leetcode.com/problems/3sum/discuss/7380/Concise-O(N2)-Java-solution
https://www.youtube.com/watch?v=jzZsG8n2R9A&t=521s

 */
public class ThreeSum {
    public static void main(String[] args) {

        ThreeSum obj = new ThreeSum();
        int[] nums = {0,0,0,0};
        List<List<Integer>> res = obj.threeSum(nums);
        System.out.println("output size: " + res.size());


    }
    public List<List<Integer>> threeSum(int[] num) {
        Arrays.sort(num);
        List<List<Integer>> res = new LinkedList<>();
        for (int i = 0; i < num.length-2; i++) {
            if (i == 0 || (i > 0 && num[i] != num[i-1])) {
                int lo = i+1, hi = num.length-1, sum = 0 - num[i];
                while (lo < hi) {
                    if (num[lo] + num[hi] == sum) {
                        res.add(Arrays.asList(num[i], num[lo], num[hi]));
                        while (lo < hi && num[lo] == num[lo+1]) lo++;
                        while (lo < hi && num[hi] == num[hi-1]) hi--;
                        lo++; hi--;
                    } else if (num[lo] + num[hi] < sum) lo++;
                    else hi--;
                }
            }
        }
        return res;
    }
}
