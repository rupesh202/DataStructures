public class ReverseArray {
    public static void main(String[] args) {
        ReverseArray reverseArray = new ReverseArray();
        int[] input = new int[]{10,5,8,30,12,12,12};
        int[] result = reverseArray.reverse(input);
        for (int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }

    }
    public int[] reverse(int[] input){
        int low =0;
        int high = input.length-1;

        while (low < high){
            //swap low and high elements

            int temp = input[low];
            input[low] = input[high];
            input[high] = temp;
            low++;
            high--;
        }
        return input;
    }
}
