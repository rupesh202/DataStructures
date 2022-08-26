public class MaxConsecutiveOneInArray {

    public static void main(String[] args) {
        MaxConsecutiveOneInArray maxConsecutiveOneInArray = new MaxConsecutiveOneInArray();
        int[] input = {1,0,1,1,1,0,1,1};
        System.out.println(maxConsecutiveOneInArray.consecutiveOnes(input));
    }

    public int consecutiveOnes(int[] input){

        int currMax=0;
        int max = 0;

        for (int i=0; i< input.length; i++){

            if (input[i] == 1){
                currMax++;
            }else {
                max = Math.max(max,currMax);
                currMax =0;
            }

        }
        return max;

    }
}
