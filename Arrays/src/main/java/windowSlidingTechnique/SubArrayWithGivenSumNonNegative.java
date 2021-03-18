package windowSlidingTechnique;

// Window Sliding technique to find SubArray of Given sum only
// works with Non Negative Integers.

// *** DOESN"T WORK WITH NEGATIVE ELEMENTS***
public class SubArrayWithGivenSumNonNegative {
    public static void main(String[] args) {
        SubArrayWithGivenSumNonNegative subArrayWithGivenSumNonNegative = new SubArrayWithGivenSumNonNegative();
        int[] input = {1,4,20,3,10,5};
        int sum =33;
        System.out.println(subArrayWithGivenSumNonNegative.subArrayWithGivenSum(input,sum));
    }

    public Boolean subArrayWithGivenSum(int[] input, int sum){
        Boolean result = false;
        int currSum =0;
        int start =0;
        for (int i=0; i< input.length; i++){

            while (currSum > sum){
                currSum = currSum - input[start];
                start++;
            }
            if (currSum == sum){
                result = true;
            }
            currSum += input[i];
        }
        return result;
    }
}
