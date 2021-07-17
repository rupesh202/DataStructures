// Find subarray with Max sum. Array contains negative elements also and is not sorted
public class KadanesAlgo {

    public static void main(String[] args) {
        int[] input = { -5,4,6,-3,4,-1 };
        System.out.println(kadaneAlgo(input));
    }
    public static int kadaneAlgo(int[] input){
        int result =0;
        int currMax =0;

        for (int i=0;i<input.length;i++){

            currMax = currMax + input[i];

            if (result < currMax){
                result = currMax;
            }
            if (currMax < 0){
                currMax = 0;
            }
        }
        return result;
    }

}
