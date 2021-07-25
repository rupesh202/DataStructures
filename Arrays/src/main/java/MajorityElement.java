public class MajorityElement {

    public static void main(String[] args) {
        MajorityElement majorityElement = new MajorityElement();
        int[] input = {8,8,6,6,6,4,6,9,9,9,9,9,9,9,9,9,9,9,9};
        int maxElement = majorityElement.majorityElementImp(input);
        System.out.println(maxElement);
        System.out.println(majorityElement.confirmIfMaxIsMajorityElement(maxElement,input));
    }

    public int majorityElementImp(int[] input){

        int count =0;
        int max = input[0];
        for (int i=0; i<input.length; i++){


            if (input[i] == max){
                count++;
            }else {
                count --;
            }
            if (count == 0){

                max = input[i];
                count =1;
             //   continue;
            }

        }
        return max;
    }
    public Boolean confirmIfMaxIsMajorityElement(int max, int[] input){
        int count =0;
        for (int i=0; i< input.length; i++){

            if (max == input[i]){
                count++;
            }
        }
        if (count > input.length/2){
            return true;
        }else {
            return false;
        }

    }
}
