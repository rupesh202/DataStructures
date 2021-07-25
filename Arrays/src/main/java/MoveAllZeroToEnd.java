public class MoveAllZeroToEnd {
    public static void main(String[] args) {
        MoveAllZeroToEnd moveAllZeroToEnd = new MoveAllZeroToEnd();
        int[] input = new int[]{5,8,0,10,20,0,0,6,0,9}; // {5,8,10,0,20,0,0,6,0,9} //
        moveAllZeroToEnd.moveAllZero(input);
        for (int i=0; i<input.length-1; i++){
            System.out.println(input[i]);
        }
    }

    public int[] moveAllZero(int[] input){
        int nonZeroCount =0;
        for (int i=0; i<input.length; i++){

            if (input[i] != 0){

                int temp = input[i];
                input[i] = input[nonZeroCount];
                input[nonZeroCount] = temp;
                nonZeroCount++;
            }
        }
        return input;
    }
}
