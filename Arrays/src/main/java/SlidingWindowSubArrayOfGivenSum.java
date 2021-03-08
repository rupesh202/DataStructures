public class SlidingWindowSubArrayOfGivenSum {

    public static void main(String[] args) {
        SlidingWindowSubArrayOfGivenSum slidingWindowSubArrayOfGivenSum = new SlidingWindowSubArrayOfGivenSum();
        int[] input = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int k =23;
        slidingWindowSubArrayOfGivenSum.subArrayOfGievnSum(input,k);
    }
    public void subArrayOfGievnSum(int[] input, int sum){

        int start =0; int end =0;
        int currSum = input[start];

        for (int i=1; i<input.length; i++){

            while (currSum > sum && start < i-1){
                currSum = currSum - input[start];
                start++;
            }
            if (currSum == sum){
                int p = i-1;
                System.out.println("Sum is between " + start + " and " + p);
                break;
            }

            currSum += input[i];


        }
    }
}
