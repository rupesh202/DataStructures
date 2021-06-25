package windowSlidingTechnique;

public class MaxSumLessOrEqualtoK {

    public static void main(String[] args) {
        MaxSumLessOrEqualtoK maxSumLessOrEqualtoK = new MaxSumLessOrEqualtoK();
        int[] input = {2, 4, 6, 8, 10};

    }

    public void maxSumEqualtoOrLess(int[] input, int K){
        int currsum =0;
        int start =0;
        for (int i=0; i<input.length;i++){

            currsum += input[i];

            while (currsum > K){

                currsum = currsum - input[start];
                start++;
            }
        }
    }

}
