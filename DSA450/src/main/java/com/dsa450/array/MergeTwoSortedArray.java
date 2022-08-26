package com.dsa450.array;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 9, 10, 15, 20};
        int[] arr2 = {2, 3, 8, 13};
        MergeTwoSortedArray obj = new MergeTwoSortedArray();
        obj.merge(arr1, arr2);
    }
    public void merge(int[] arr1, int[] arr2){

        int[] result = new int[arr1.length + arr2.length];

        int m =0; int n =0;
        int k =0;

        while(m < arr1.length && n < arr2.length){
            if (arr1[m] < arr2[n]){
                result[k] = arr1[m];
                m++;

            }else{
                result[k] = arr2[n];
                n++;
            }
            k++;
        }

        while (m < arr1.length ){
            result[k] = arr1[m];
            m++;
            k++;
        }
        while (n < arr2.length ){
            result[k] = arr2[n];
            n++;
            k++;
        }
        for (int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }
}
