public class isArraySorted {
    public static void main(String[] args) {

        int[] input = new int[]{1,2,3,4,5,6,7,1,10,12,20};
        isArraySorted isArraySorted = new isArraySorted();
        System.out.println(isArraySorted.checkIfArrayIsSorted(input));
    }
    public Boolean checkIfArrayIsSorted(int[] input){
        int length = input.length;
        Boolean result = true;
        for(int i=0; i<length -1; i++){
            if (input[i] > input[i+1]){
                result = false;
            }
        }
        return result;
    }
}
