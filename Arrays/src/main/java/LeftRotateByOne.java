import java.util.List;

public class LeftRotateByOne {

    public static void main(String[] args) {
        LeftRotateByOne leftRotateByOne = new LeftRotateByOne();
        int[] input = new int[]{1,2,4,6,8};
        int[] result = leftRotateByOne.leftRotateOne(input);
        for (int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }

    }

    public int[] leftRotateOne(int[] input){

        int k =1; //no of times to rotate
        int temp =0;
        int len = input.length;

        while (k != 0){
            temp = input[0];
            for (int i=0; i<len-1; i++){

                input[i] = input[i+1];
            }
            input[len-1] = temp;
            k--;
        }

        return input;
    }
}
