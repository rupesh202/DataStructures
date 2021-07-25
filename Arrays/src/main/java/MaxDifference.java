public class MaxDifference {
    public static void main(String[] args) {
        MaxDifference maxDifference = new MaxDifference();
        int[] input = new int[]{7,2,5,6,3,9};
        int result = maxDifference.maxDifferenceInArray(input);
        System.out.println(result);
    }
    public int maxDifferenceInArray(int[] input){

        int min = input[0];
        int maxDiff = input[1] - input[0];

        for (int i =0; i<input.length; i++){

            maxDiff = Math.max(maxDiff, input[i] -min);
            min = Math.min(input[i],min);
        }
        return maxDiff;
    }
}
