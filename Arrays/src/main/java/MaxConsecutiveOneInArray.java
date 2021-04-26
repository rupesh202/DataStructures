public class MaxConsecutiveOneInArray {

    public static void main(String[] args) {
        MaxConsecutiveOneInArray maxConsecutiveOneInArray = new MaxConsecutiveOneInArray();
        int[] input = {1,0,1,1,1,0,1,1};
        System.out.println(maxConsecutiveOneInArray.maxOne(input));
    }

    public int maxOne(int[] input){
        int maxOnes =0;
        int max =0;
        for (int i=0; i<input.length; i++){

            if (input[i] ==0){
                maxOnes = Math.max(max,maxOnes);
                max =0;
            }
            max++;

        }
        return maxOnes;
    }
}
