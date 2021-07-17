public class SelectionSort {

    public void selectionSortImpl(int[] input){


        for(int i=0;i<input.length;i++){
            int currMinIndx =i;
            for (int j = i+1; j<input.length; j++){
                if(input[j] < input[currMinIndx]){
                    currMinIndx = j;
                }
            }

                int temp = input[i];
                input[i] = input[currMinIndx];
                input[currMinIndx] = temp;

        }
        for(int i=0; i<input.length;i++){
            System.out.println(input[i]);
        }

    }
    public static void main(String[] args) {
        int[] input = {10,8,9,15,28,2,83,19,52,46,81};
        SelectionSort sort = new SelectionSort();
        sort.selectionSortImpl(input);
    }
}
