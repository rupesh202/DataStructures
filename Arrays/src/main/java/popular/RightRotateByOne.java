package popular;

public class RightRotateByOne {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        RightRotateByOne obj = new RightRotateByOne();
        obj.rightRotateone(arr,n);

    }
    public void rightRotateone(int[] arr, int n){

        int temp = arr[n-1];
        for(int i=n-2; i>=0; i--){
            arr[i+1] = arr[i];

        }
        arr[0] = temp;

        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

}
