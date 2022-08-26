package windowSlidingTechnique;

public class MaxSumInSubArrayOfSizeK {

    public static void main(String[] args) {
        MaxSumInSubArrayOfSizeK maxSumInSubArrayOfSizeK = new MaxSumInSubArrayOfSizeK();
        int[] input = {1,8,30,-5,20,7};
        int k =3;
        System.out.println(maxSumInSubArrayOfSizeK.maxSumSubarray(input,k));

    }
    public int maxSumInSubArrayImp(int[] input, int k){

        int max =0;
        int currSum =0;
        for (int i=0; i<k; i++){
            currSum += input[i];
        }
        for (int i = k; i< input.length; i++){

            currSum = currSum + input[i] - input[i-k];
            max = Math.max(max, currSum);
        }
        return max;
    }

    public int maxSumSubarray(int[] input, int k){

        int max =0;
        int currMax = 0;

        for(int i=0; i<k;i++){
            currMax = currMax + input[i];
        }
        max = Math.max(max, currMax);

        for (int i=k; i<input.length;i++){

            currMax = currMax +input[i] - input[i-k];
            max = Math.max(max,currMax);
        }
        return max;
    }
}
