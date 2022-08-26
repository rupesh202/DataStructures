package popular;

// Find the index where the sum to the left of the index = sum to the right of the index

import java.util.HashMap;
import java.util.Map;

public class Equilibrium {
    public static void main(String[] args) {
        Equilibrium obj = new Equilibrium();
        int[] input = {-7, 1, 5, 2, -4, 3, 0};
        int[] input1 = {9, 3, 7, 6, 8, 1, 10};
        System.out.println(obj.getEquilibrium(input));
    }
    // Using extra space O(n)
    public int findEquilibrium(int[] input){

        int totalSum =0;
        int result =-1;
        Map<Integer, Integer> hashMap = new HashMap<>();

        int currSum =0;
        for (int i=0;i<input.length; i++){
            currSum += input[i];

            hashMap.put(i,currSum);
        }
        for (int i =0; i<input.length; i++){
            totalSum += input[i];
        }
        for (int i=1; i<input.length-1;i++){

            int leftSum =0;
            int rightSum =0;
// -1
// 0 +2 -1
            leftSum = hashMap.get(i-1);
            rightSum = totalSum - input[i] - leftSum;

            if (leftSum == rightSum){
                result =i;
            }

        }
        return result;
    }
    // Constant extra space
    public int getEquilibrium(int[] input){

        int totalSum =0;
        int result =0;
        for(int i=0; i< input.length; i++){
            totalSum += input[i];
        }

        int leftsum =input[0];
        int rightsum =0;

        for (int i=1; i<input.length-1; i++){
//-1
// 0 -2 -1
// 0 -2 -(-1)  == -1
            rightsum = totalSum - input[i] - leftsum;
            if (leftsum == rightsum){
                result = i;
            }
            leftsum += input[i];

        }
        return result;
    }
}
