public class MaxSumSubArray {
    public static void main(String[] args) {
        MaxSumSubArray maxSumSubArray = new MaxSumSubArray();
        int[] input = new int[]{-3,8,-2,4,-5,6};
        System.out.println(maxSumSubArray.findMaxSubArray(input));
    }
    // Max Subarray is calculated by keeping the max count of an array.
    // check if the the result is greater with only exsisting sum or existing sum + current element.
    public int findMaxSubArray(int[] input){

        int result = input[0];
        int maxEnding = input[0];
        for (int i=0; i< input.length; i++){

            maxEnding = Math.max(maxEnding+input[i], input[i]);
            result = Math.max(result,maxEnding);
        }

        return result;
    }
}
