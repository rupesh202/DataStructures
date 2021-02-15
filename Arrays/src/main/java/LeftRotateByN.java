public class LeftRotateByN {
    public static void main(String[] args) {
        LeftRotateByN leftRotateByN = new LeftRotateByN();
        int[] input = new int[]{1,2,3,4,5};
        int d = 2;
        int[] result = leftRotateByN.leftRotateByNImp(input,d);
        for (int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }

    }
    // Best solution.
    // Time: O(n) Space : O(1)
    public int[] leftRotateByNImp(int[] input, int d){
        // Reverse array (0,d-1)
        // Reverse array (d,n-1)
        // Reverse array (0,n-1)
        int n = input.length;
        reverseArray(input,0,d-1);
        reverseArray(input,d,n-1);
        reverseArray(input,0,n-1);

        return input;
    }
    public int[] reverseArray(int[] input, int start, int end){

        while (start < end){

            int temp = input[start];
            input[start] = input[end];
            input[end] = temp;

            start++;
            end--;
        }
        return input;
    }

}
