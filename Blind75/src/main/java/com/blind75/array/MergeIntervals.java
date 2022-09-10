package com.blind75.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

https://leetcode.com/problems/merge-intervals/
sol:
https://leetcode.com/problems/merge-intervals/discuss/1644169/Java-oror-simple-Steps-explained-oror-simple-sort

 */
public class MergeIntervals {
    public static void main(String[] args) {
        MergeIntervals obj = new MergeIntervals();
        int[][] input = {{1,3},{2,6},{8,10},{15,18}};
        //[[1,6],[8,10],[15,18]]
        obj.merge(input);

    }
    public int[][] merge(int[][] intervals) {

        // sort our intervals
        Arrays.sort(intervals, (o1,o2)->o1[0]-o2[0]);

        ArrayList<int[]> ans  =  new ArrayList<>();
        // intial range
        int start  =  intervals[0][0];
        int end =  intervals[0][1];

        int  i =1;
        while(i<intervals.length){
            int s = intervals[i][0];
            int e = intervals[i][1];
            // next interval start is smaller than prev end and array is sorted
            // so these two internal can merge
            if( s<=end  ) {
                // so merge both intervals
                end =  Math.max(end,e);
            }
            else{ // if merge not possible , then insert prev interval into list
                ans.add(new int[]{start,end});
                start = s;
                end =  e;
            }
            i++;
        }

        ans.add(new int[] {start,end});

        return ans.toArray(new int[0][]);

    }
}
