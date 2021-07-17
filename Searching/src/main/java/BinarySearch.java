public class BinarySearch {

    public int binarySearchImp(int[] input, int key){

        int low = 0, high = input.length;
        int mid = -1;
        while (low <= high){

            mid = low + (high -low)/2;
            if (input[mid] == key){
                return mid;
            }
            else if(input[mid] < key){
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        return -1;
    }

    public int binarySearchRecursion(int[] arr, int low, int high,int key){

        if (high >= low){
            int mid = low + (high - low)/2;

            if(arr[mid] == key){
                return mid;
            }else if(arr[mid] > key){
                return binarySearchRecursion(arr,low,mid-1,key);
            }else {
                return binarySearchRecursion(arr,mid+1,high,key);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] input = {3,6,9,13,18,20,25,29,32,63,78,92,100};
//        System.out.println(binarySearch.binarySearchImp(input,3));
        System.out.println(binarySearch.binarySearchRecursion(input,0,input.length,20));


    }
}
