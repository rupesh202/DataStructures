package popular;

/*
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.

https://leetcode.com/explore/interview/card/top-interview-questions-hard/116/array-and-strings/834/
 */
public class DuplicateNumberInArrayFloydsAlgo {
    public static void main(String[] args) {
        DuplicateNumberInArrayFloydsAlgo obj = new DuplicateNumberInArrayFloydsAlgo();
        int[] input = {3,1,3,4,2};
        System.out.println(obj.duplicate(input));
    }
    public int duplicate(int[] nums){
        // Floyd's algorithm

        int slow = nums[0];
        int fast = nums[0];

        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while (slow != fast);

        fast = nums[0];
        while (slow != fast){
            slow = nums[slow];
            fast = nums[fast];

        }
        return slow;
    }
}
