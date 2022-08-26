public class MaxOddEvenLengthSubArray {
    public static void main(String[] args) {
        MaxOddEvenLengthSubArray maxOddEvenLengthSubArray = new MaxOddEvenLengthSubArray();
        int[] input = {5,10,20,6,3,8,5,2,7,8,9,9,9,8,7,6,5,4,3,2,1,2,3,4,5,5,5,5};
        System.out.println(maxOddEvenLengthSubArray.evenOddMaxLength(input));
    }

    public int maxOddEven(int[] input){

        int result =0;
        int currMax =0;

        for (int i=1;i<input.length; i++){

            if ((input[i] % 2 ==0 && input[i-1] % 2 != 0) || (input[i] % 2 !=0 && input[i-1] % 2 == 0) ){
                currMax++;
                result = Math.max(result,currMax);

            }else {
                currMax =1;
            }
        }
        return result;
    }

    //{5,10,20,6,3,8,5,2,7,8,9}
    public int evenOddMaxLength(int[] input){

        int currSum =0;
        int max =0;
        for (int i=1; i<input.length; i++){

            if ((input[i] % 2 == 0 && input[i-1] % 2 !=0) || (input[i] % 2 !=0 && input[i-1] %2 ==0)){
                currSum++;
                max = Math.max(currSum,max);
            }else {
                max = Math.max(currSum,max);
                currSum =1;
            }

        }
     return max;
    }
}
