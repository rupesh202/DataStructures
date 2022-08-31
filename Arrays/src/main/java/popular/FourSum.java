package popular;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given four integer arrays nums1, nums2, nums3, and nums4
 * all of length n, return the number of tuples (i, j, k, l) such that:
 *
 * 0 <= i, j, k, l < n
 * nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0
 *
 */
public class FourSum {
    public static void main(String[] args) {
        FourSum obj = new FourSum();

        int[] nums1 ={1,2};
        int[] nums2 = {-2,-1};
        int[] nums3 = {-1,2};
        int[] nums4 = {0,2};

        obj.tuplesSumZero(nums1,nums2,nums3,nums4);
    }

    /**
     * nums1 = [1,2], nums2 = [-2,-1], nums3 = [-1,2], nums4 = [0,2]
     *
     * Iterated over nums1 and nums2, pairSums = {1 + (-2), 1 + (-1), 2 + (-2), 2 + (-1)}
     * = {-1, 0, 0, 1}
     * pairCountBySum = {-1 : 1, 0 : 2, 1 : 1}, i.e. there is 1 pair with sum = 1, 2 pairs with sum = 0, 1 pair with sum = -1
     *
     * Iterated over nums3 and nums4, pairSums = {-1 + 0, -1 + 2, 2 + 0, 2 + 2}
     * = {-1, 1, 2, 4}
     * Negate this to be able to find -(c + d)
     * = {1, -1, -2, -4}
     *
     * Use the hashMap pairCountBySum = {-1 : 1, 0 : 2, 1 : 1} for each item in {1, -1, -2, -4}
     *
     * fourSumCount = 0
     * fourSumCount += map.get(1)  ⇒ fourSumCount = 0 + 1 = 1
     * fourSumCount += map.get(-1) ⇒ fourSumCount = 1 + 1 = 2
     * fourSumCount += map.get(-2) ⇒ fourSumCount = 2 + 0 = 2
     * fourSumCount += map.get(-4) ⇒ fourSumCount = 2 + 0 = 2
     *
     * Number of tuples = 2 [Ans]
     */
    public int tuplesSumZero(int[] nums1, int[] nums2, int[] nums3, int[] nums4){

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i< nums1.length; i++){
            for(int j=0;j<nums2.length;j++){
                int sum = nums1[i] + nums2[j];
                map.put(sum, map.getOrDefault(sum, 0)+1);
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums3.length;i++){
            for(int j=0;j<nums4.length;j++){
                int sum = nums3[i] + nums4[j];
                sum = sum * -1;
                list.add(sum);
            }
        }

        int result =0;
        for(Integer a : list){
            result = result + map.getOrDefault(a,0);
        }

        return result;

    }
}
