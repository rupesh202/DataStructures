public class MergeSort {

    public void sort(int[] input, int low, int high){

        if(low < high){
            int mid = low + (high -low)/2;
            sort(input,low,mid);
            sort(input,mid+1,high);
            merge(input,low,mid,high);
        }
    }
    public void merge(int[] arr, int low, int mid, int high){

        int n1 = mid - low + 1;
        int n2 = high - mid;
        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i=0; i<n1; ++i){
            L[i] = arr[low + i];
        }
        for(int j=0; j<n2; ++j){
            R[j] = arr[mid +1 +j];
        }

        //merge the temp arr
        int i=0, j=0, k = low;
        while (i < n1 && j<n2){

            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        //Copy remaining elements
        while (i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2){
            arr[k] = R[j];
            j++;
            k++;
        }

    }
    public static void main(String[] args) {
        MergeSort sort = new MergeSort();
        int[] input = {19,1,10,52,92,46,17,37,62,39};
        sort.sort(input,0,input.length-1);
        for(int i=0;i<input.length;i++){
            System.out.println(input[i]);
        }
    }
}
