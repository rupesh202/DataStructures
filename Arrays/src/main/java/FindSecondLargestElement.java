// Find the second largest element in an array and return its position

public class FindSecondLargestElement {

    public static void main(String[] args){

        int largest =-1;
        int result= -1;

        int[] inputArray = new int[]{1,5,2,14,76,25,42,75,18,68,26,75,75,75,100};
        FindSecondLargestElement findPositionOfSecondLargest = new FindSecondLargestElement();
        int position = findPositionOfSecondLargest.findPositionOfSecondLargest(largest,result,inputArray);
        System.out.println("Position is: " + position);
        System.out.println("Value is: " + inputArray[position]);

    }

    public int findPositionOfSecondLargest(int largest, int result, int[] inputArray){
        int len = inputArray.length;
        for (int i=0; i<len; i++){

            if (result == -1){
                result = i;
            }
            if (largest == -1){
                largest = i;
            }

            if (inputArray[i] > inputArray[largest]){
                result = largest;
                largest = i;
            }
            if ((inputArray[i] > inputArray[result]) && (inputArray[i] < inputArray[largest])){
                result = i;
            }
        }
        return result;
    }
}
