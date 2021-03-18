package windowSlidingTechnique;

import java.util.HashMap;

public class DistinctElementsInWindowK {
    public static void main(String[] args) {
        DistinctElementsInWindowK distinctElementsInWindowK = new DistinctElementsInWindowK();
        int [] input = {1, 2, 1, 3, 4, 2, 3};
        int k=4;
        distinctElementsInWindowK.distinctElementsInWindowKImp(input,k);

    }
    public void distinctElementsInWindowKImp(int[] input, int k){

        HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();

        for (int i=0; i<k; i++){
            countMap.put(input[i], countMap.getOrDefault(input[i],0) + 1);
        }
        System.out.println(countMap.size());

        for (int i=k;i<input.length; i++){

            if (countMap.get(input[i-k]) == 1){
                countMap.remove(input[i-k]);
            }else {
                countMap.put(input[i-k], countMap.get(input[i-k]) -1);
            }

            countMap.put(input[i], countMap.getOrDefault(input[i],0) + 1);
            System.out.println(countMap.size());
        }
    }
}
