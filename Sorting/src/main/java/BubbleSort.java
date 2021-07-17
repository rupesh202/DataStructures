public class BubbleSort {

    public void bubbleSortImpl(int[] input){

        for(int i=0; i<input.length -1; i++){

            for (int j =0; j< input.length-i-1; j++){
                if(input[j] > input[j+1]){
                    int temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] input = {10,5,8,17,20,1,100};
        bubbleSort.bubbleSortImpl(input);
    }
}
