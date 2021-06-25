public class MaxOddEvenLengthSubArray {
    public static void main(String[] args) {
        MaxOddEvenLengthSubArray maxOddEvenLengthSubArray = new MaxOddEvenLengthSubArray();
        int[] input = {5,10,20,6,3,8,5,2,7,8,9};
        System.out.println(maxOddEvenLengthSubArray.maxOddEven(input));
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
}
