package popular;

/*
Given an unsorted integer array nums, return the smallest missing positive integer.

You must implement an algorithm that runs in O(n) time and uses constant extra space.

 */

import java.util.HashMap;
import java.util.Map;

public class MinPositiveMissingInteger {
    public static void main(String[] args) {
        MinPositiveMissingInteger obj = new MinPositiveMissingInteger();
        int[] input = {3,4,-1,1};
        obj.minpositiveMissingExtraSpace(input);
        System.out.println(obj.minPositiveMissingWithoutExtraSpace(input));
    }

    // Using extra space
    public void minpositiveMissingExtraSpace(int[] input){

        // missing integer will always be in the range of 0 to n+1
        int n = input.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i< input.length; i++){
            if (input[i] > 0){
                map.put(input[i], map.getOrDefault(input[i],0) +1);
            }
        }
        int result = -1;
        for(int i=1; i<n+1; i++){
            if (map.get(i) == null){
                result = i;
                break;
            }
        }
        System.out.println("With space: " + result);
    }
    public int minPositiveMissingWithoutExtraSpace(int[] nums){

        int n = nums.length;
        for (int i=0; i<n; i++){

            while (nums[i] != i+1){

                if (nums[i] <=0 || nums[i] >= n){
                    break;
                }
                if (nums[i] == nums[nums[i]] -1){
                    break;
                }
                int temp = nums[i];
                nums[i] = nums[temp -1];
                nums[temp -1] = temp;

            }
        }

        for (int i=0; i<n; i++){
            if (nums[i] != i +1){
                return i +1;
            }
        }
        return n+1;
    }
}
