public class QuickSort {

    public int partition(int[] arr, int low, int high){

        int pivot = arr[(low+high)/2];

        while (low <= high){

            while (arr[low] < pivot){
                low++;
            }
            while (arr[high] > pivot){
                high--;
            }
            if(low <= high){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;

                low++;
                high--;
            }
        }
        return low;
    }
    public void quickSortImpl(int[] input, int low, int high){
        int pi = partition(input,low,high);

        if(low < pi-1){
            quickSortImpl(input,low,pi-1);
        }
        if(pi< high){
            quickSortImpl(input,pi,high);
        }
    }

    public static void main(String[] args) {
        QuickSort sort = new QuickSort();
        int[] input = {16,82,16,48,28,37,100,72,49};
        sort.quickSortImpl(input,0,input.length-1);

        for (int i=0; i < input.length-1; i++){
            System.out.println(input[i]);
        }

    }
}
