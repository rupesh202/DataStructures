package popular;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

https://leetcode.com/explore/interview/card/top-interview-questions-hard/116/array-and-strings/833/
 */
public class LengthOfConsecutiveNumbers {
    public static void main(String[] args){

        int[] input = {100,4,200,1,3,2};//{0,0,1,2,3,4,5,6,7,8}
        LengthOfConsecutiveNumbers obj = new LengthOfConsecutiveNumbers();
        System.out.println(obj.consecutiveNumbers(input));
        System.out.println("O(n): " + obj.consecutiveLinearTime(input));

    }
    // Time complexity is O(n logn)
    public int consecutiveNumbers(int[] input){

        Arrays.sort(input);
        int result =0;
        int currlen =0;
        for (int i=0; i<input.length -1; i++){
            if (input[i+1] == input[i] +1){
                currlen++;
            }else{
                currlen=0;
            }
            result = Math.max(result,currlen);
        }
        return result+1;
    }
    // Time complexity is O(n) space is O(n)
    public int consecutiveLinearTime(int[] nums){
        // 100,4,200,1,3,2
        Set<Integer> set = new HashSet<>();
        for (int i=0; i< nums.length;i++){
            set.add(nums[i]);
        }
        int result =0;

        for (int i=0;i<nums.length;i++){
            int currLen =0;
            if (!set.contains(nums[i]-1)){
                currLen = 1;
                int x = nums[i];
                while (set.contains(x+1)){
                    currLen++;
                    x++;
                }
                result = Math.max(result,currLen);

            }
        }
        return result;

    }
}
