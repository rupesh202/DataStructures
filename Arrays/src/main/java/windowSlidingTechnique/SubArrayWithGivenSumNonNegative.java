package windowSlidingTechnique;

// Window Sliding technique to find SubArray of Given sum only
// works with Non Negative Integers.

// *** DOESN"T WORK WITH NEGATIVE ELEMENTS***
public class SubArrayWithGivenSumNonNegative {
    public static void main(String[] args) {
        SubArrayWithGivenSumNonNegative subArrayWithGivenSumNonNegative = new SubArrayWithGivenSumNonNegative();
        int[] input = {1,4,20,3,10,5};
        int sum =18;
        //sum 18
        System.out.println(subArrayWithGivenSumNonNegative.subarrayforaSum(input,sum));

    }

    public boolean subarrayforaSum(int[] input, int sum){
//{1,4,20,3,10,5} // 18
        int currSum = 0;
        boolean result = false;
        int start = 0;

        for (int i=0; i<input.length; i++){

            currSum = currSum + input[i];

            while (currSum > sum ){
                currSum = currSum - input[start];
                start++;
            }
            if (currSum == sum){
                result = true;
            }
        }
        return result;
    }
}
