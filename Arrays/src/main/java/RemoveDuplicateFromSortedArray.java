public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        RemoveDuplicateFromSortedArray removeDup = new RemoveDuplicateFromSortedArray();
        int[] input = new int[]{1,2,4,4,5,6,7,7,7,9,10,10};
        int[] result = removeDup.removeDup(input);
        for (int i =0; i<result.length; i++){
            System.out.println(result[i]);

        }
        System.out.println("Size is: " + result.length);
    }

    public int[] removeDup(int[] input){
        int[] result = new int[input.length];
        result[0] = input[0];
        int k=1;
        for (int i =1; i<input.length; i++){

            if (input[i-1] != input[i]){
                result[k] = input[i];
                k++;
            }
        }

        return result;
    }
}
